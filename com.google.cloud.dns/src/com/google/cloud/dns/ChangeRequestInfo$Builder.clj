(ns com.google.cloud.dns.ChangeRequestInfo$Builder
  "A builder for ChangeRequestInfo."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns ChangeRequestInfo$Builder]))

(defn ->builder
  "Constructor."
  (^ChangeRequestInfo$Builder []
    (new ChangeRequestInfo$Builder )))

(defn delete
  "Adds a RecordSet to be deleted to the zone upon executing this
   ChangeRequestInfo.

  record-set - `com.google.cloud.dns.RecordSet`

  returns: `com.google.cloud.dns.ChangeRequestInfo$Builder`"
  (^com.google.cloud.dns.ChangeRequestInfo$Builder [^ChangeRequestInfo$Builder this ^com.google.cloud.dns.RecordSet record-set]
    (-> this (.delete record-set))))

(defn clear-deletions
  "Clears the collection of RecordSets which are to be deleted from the zone upon
   executing this ChangeRequestInfo.

  returns: `com.google.cloud.dns.ChangeRequestInfo$Builder`"
  (^com.google.cloud.dns.ChangeRequestInfo$Builder [^ChangeRequestInfo$Builder this]
    (-> this (.clearDeletions))))

(defn remove-deletion
  "Removes a single RecordSet from the collection of records to be
   deleted from the zone upon executing this ChangeRequestInfo.

  record-set - `com.google.cloud.dns.RecordSet`

  returns: `com.google.cloud.dns.ChangeRequestInfo$Builder`"
  (^com.google.cloud.dns.ChangeRequestInfo$Builder [^ChangeRequestInfo$Builder this ^com.google.cloud.dns.RecordSet record-set]
    (-> this (.removeDeletion record-set))))

(defn build
  "Creates a ChangeRequestInfo instance populated by the values associated with this
   builder.

  returns: `com.google.cloud.dns.ChangeRequestInfo`"
  (^com.google.cloud.dns.ChangeRequestInfo [^ChangeRequestInfo$Builder this]
    (-> this (.build))))

(defn set-additions
  "Sets a collection of RecordSets which are to be added to the zone upon executing this
   ChangeRequestInfo.

  additions - `java.util.List`

  returns: `com.google.cloud.dns.ChangeRequestInfo$Builder`"
  (^com.google.cloud.dns.ChangeRequestInfo$Builder [^ChangeRequestInfo$Builder this ^java.util.List additions]
    (-> this (.setAdditions additions))))

(defn set-deletions
  "Sets a collection of RecordSets which are to be deleted from the zone upon executing
   this ChangeRequestInfo.

  deletions - `java.util.List`

  returns: `com.google.cloud.dns.ChangeRequestInfo$Builder`"
  (^com.google.cloud.dns.ChangeRequestInfo$Builder [^ChangeRequestInfo$Builder this ^java.util.List deletions]
    (-> this (.setDeletions deletions))))

(defn add
  "Adds a RecordSet to be added to the zone upon executing this ChangeRequestInfo.

  record-set - `com.google.cloud.dns.RecordSet`

  returns: `com.google.cloud.dns.ChangeRequestInfo$Builder`"
  (^com.google.cloud.dns.ChangeRequestInfo$Builder [^ChangeRequestInfo$Builder this ^com.google.cloud.dns.RecordSet record-set]
    (-> this (.add record-set))))

(defn remove-addition
  "Removes a single RecordSet from the collection of records to be
   added to the zone upon executing this ChangeRequestInfo.

  record-set - `com.google.cloud.dns.RecordSet`

  returns: `com.google.cloud.dns.ChangeRequestInfo$Builder`"
  (^com.google.cloud.dns.ChangeRequestInfo$Builder [^ChangeRequestInfo$Builder this ^com.google.cloud.dns.RecordSet record-set]
    (-> this (.removeAddition record-set))))

(defn clear-additions
  "Clears the collection of RecordSets which are to be added to the zone upon executing
   this ChangeRequestInfo.

  returns: `com.google.cloud.dns.ChangeRequestInfo$Builder`"
  (^com.google.cloud.dns.ChangeRequestInfo$Builder [^ChangeRequestInfo$Builder this]
    (-> this (.clearAdditions))))

