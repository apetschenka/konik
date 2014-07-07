/* Copyright (C) 2014 konik.io
 *
 * This file is part of the Konik library.
 *
 * The Konik library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * The Konik library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with the Konik library. If not, see <http://www.gnu.org/licenses/>.
 */
package io.konik.zugferd.entity.trade;

import io.konik.zugferd.entity.CommonDelivery;
import io.konik.zugferd.entity.Consignment;
import io.konik.zugferd.entity.Event;
import io.konik.zugferd.entity.ReferencedDocument;
import io.konik.zugferd.entity.TradeParty;

import java.util.List;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * = The trade delivery information.
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = { "relatedConsignment", "shipTo", "ultimateShipTo","shipFrom", "actualDelivery", "despatchAdvice", "note" })
public class Delivery extends CommonDelivery<ReferencedDocument> {

   @Valid
   @XmlElement(name = "RelatedSupplyChainConsignment")
   private List<Consignment> relatedConsignment;

   @Valid
   @XmlElement(name = "ShipFromTradeParty")
   private TradeParty shipFrom;
 
   @Valid
   @XmlElement(name = "DespatchAdviceReferencedDocument")
   private ReferencedDocument despatchAdvice;
   
   @Valid
   @XmlElement(name = "DeliveryNoteReferencedDocument")
   private ReferencedDocument note;

   Delivery() {
      super();
   }

   /**
    * The Constructor.
    * 
    * @param actualDelivery
    */
   public Delivery(Event actualDelivery) {
      super();
      setActualDelivery(actualDelivery);
   }

   /**
    * Gets the related consignment.
    *
    * @return the related consignment
    */
   public List<Consignment> getRelatedConsignment() {
      return relatedConsignment;
   }

   /**
    * Sets the related consignment.
    *
    * @param relatedConsignment the related consignment
    * @return the trade delivery
    */
   public Delivery setRelatedConsignment(List<Consignment> relatedConsignment) {
      this.relatedConsignment = relatedConsignment;
      return this;
   }

   /**
    * Gets the ship from.
    *
    * @return the ship from
    */
   public TradeParty getShipFrom() {
      return shipFrom;
   }

   /**
    * Sets the ship from.
    *
    * @param shipFrom the ship from
    * @return the trade delivery
    */
   public Delivery setShipFrom(TradeParty shipFrom) {
      this.shipFrom = shipFrom;
      return this;
   }

   /**
    * Gets the despatch advice.
    *
    * @return the despatch advice
    */
   @Override
   public ReferencedDocument getDespatchAdvice() {
      return despatchAdvice;
   }

   /**
    * Sets the despatch advice.
    *
    * @param despatchAdvice the despatch advice
    * @return the trade delivery
    */
   @Override
   public Delivery setDespatchAdvice(ReferencedDocument despatchAdvice) {
      this.despatchAdvice = despatchAdvice;
      return this;

   }

   /**
    * Gets the note.
    *
    * @return the note
    */
   @Override
   public ReferencedDocument getNote() {
      return note;
   }

   /**
    * Sets the note.
    *
    * @param note the note
    * @return the trade delivery
    */
   @Override
   public Delivery setNote(ReferencedDocument note) {
      this.note = note;
      return this;
   }

}