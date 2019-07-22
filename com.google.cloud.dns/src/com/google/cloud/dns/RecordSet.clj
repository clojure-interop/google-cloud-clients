(ns com.google.cloud.dns.RecordSet
  "A class that represents a Google Cloud DNS record set.

  A RecordSet is the unit of data that will be returned by the DNS servers upon a DNS
  request for a specific domain. The RecordSet holds the current state of the DNS records
  that make up a zone. You can read the records but you cannot modify them directly. Rather, you
  edit the records in a zone by creating a ChangeRequest."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns RecordSet]))

(defn *new-builder
  "Creates a RecordSet builder for the given name and type.

  name - `java.lang.String`
  type - `com.google.cloud.dns.RecordSet$Type`

  returns: `com.google.cloud.dns.RecordSet$Builder`"
  (^com.google.cloud.dns.RecordSet$Builder [^java.lang.String name ^com.google.cloud.dns.RecordSet$Type type]
    (RecordSet/newBuilder name type)))

(defn to-builder
  "Creates a builder pre-populated with the attribute values of this instance.

  returns: `com.google.cloud.dns.RecordSet$Builder`"
  (^com.google.cloud.dns.RecordSet$Builder [^RecordSet this]
    (-> this (.toBuilder))))

(defn get-name
  "Returns the user-assigned name of this record set.

  returns: `java.lang.String`"
  (^java.lang.String [^RecordSet this]
    (-> this (.getName))))

(defn get-records
  "Returns a list of records stored in this record set.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RecordSet this]
    (-> this (.getRecords))))

(defn get-ttl
  "Returns the number of seconds that this record set can be cached by resolvers.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^RecordSet this]
    (-> this (.getTtl))))

(defn get-type
  "Returns the type of this record set.

  returns: `com.google.cloud.dns.RecordSet$Type`"
  (^com.google.cloud.dns.RecordSet$Type [^RecordSet this]
    (-> this (.getType))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RecordSet this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RecordSet this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RecordSet this]
    (-> this (.toString))))

