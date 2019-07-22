(ns com.google.cloud.dns.RecordSet$Builder
  "A builder for RecordSet."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns RecordSet$Builder]))

(defn add-record
  "Adds a record to the record set. The records should be as defined in RFC 1035 (section 5) and
   RFC 1034 (section 3.6.1). Examples of records are available in Google DNS documentation.

  record - `java.lang.String`

  returns: `com.google.cloud.dns.RecordSet$Builder`"
  (^com.google.cloud.dns.RecordSet$Builder [^RecordSet$Builder this ^java.lang.String record]
    (-> this (.addRecord record))))

(defn remove-record
  "Removes a record from the set. An exact match is required.

  record - `java.lang.String`

  returns: `com.google.cloud.dns.RecordSet$Builder`"
  (^com.google.cloud.dns.RecordSet$Builder [^RecordSet$Builder this ^java.lang.String record]
    (-> this (.removeRecord record))))

(defn clear-records
  "Removes all the records.

  returns: `com.google.cloud.dns.RecordSet$Builder`"
  (^com.google.cloud.dns.RecordSet$Builder [^RecordSet$Builder this]
    (-> this (.clearRecords))))

(defn set-records
  "Replaces the current records with the provided list of records.

  records - `java.util.List`

  returns: `com.google.cloud.dns.RecordSet$Builder`"
  (^com.google.cloud.dns.RecordSet$Builder [^RecordSet$Builder this ^java.util.List records]
    (-> this (.setRecords records))))

(defn set-name
  "Sets the name for this record set. For example, www.example.com.

  name - `java.lang.String`

  returns: `com.google.cloud.dns.RecordSet$Builder`"
  (^com.google.cloud.dns.RecordSet$Builder [^RecordSet$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-ttl
  "Sets the time that this record can be cached by resolvers. This number must be non-negative.
   The maximum duration must be equivalent to at most Integer.MAX_VALUE seconds.

  duration - A non-negative number of time units - `int`
  unit - The unit of the ttl parameter - `java.util.concurrent.TimeUnit`

  returns: `com.google.cloud.dns.RecordSet$Builder`"
  (^com.google.cloud.dns.RecordSet$Builder [^RecordSet$Builder this ^Integer duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.setTtl duration unit))))

(defn set-type
  "The identifier of a supported record type, for example, A, AAAA, MX, TXT, and so on.

  type - `com.google.cloud.dns.RecordSet$Type`

  returns: `com.google.cloud.dns.RecordSet$Builder`"
  (^com.google.cloud.dns.RecordSet$Builder [^RecordSet$Builder this ^com.google.cloud.dns.RecordSet$Type type]
    (-> this (.setType type))))

(defn build
  "Builds the record set.

  returns: `com.google.cloud.dns.RecordSet`"
  (^com.google.cloud.dns.RecordSet [^RecordSet$Builder this]
    (-> this (.build))))

