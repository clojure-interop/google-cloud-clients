(ns com.google.cloud.dns.Dns$RecordSetListOption
  "Class for specifying record set listing options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns Dns$RecordSetListOption]))

(defn *fields
  "Returns an option to specify the record set's fields to be returned by the RPC call.

   If this option is not provided all record fields are returned. RecordSetField.fields can be used to specify only the fields of interest. The name of the
   record set in always returned, even if not specified. Dns.RecordSetField provides a list
   of fields that can be used.

  fields - `com.google.cloud.dns.Dns$RecordSetField`

  returns: `com.google.cloud.dns.Dns$RecordSetListOption`"
  (^com.google.cloud.dns.Dns$RecordSetListOption [^com.google.cloud.dns.Dns$RecordSetField fields]
    (Dns$RecordSetListOption/fields fields)))

(defn *page-token
  "Returns an option to specify a page token.

   The page token (returned from a previous call to list) indicates from where listing should
   continue.

  page-token - `java.lang.String`

  returns: `com.google.cloud.dns.Dns$RecordSetListOption`"
  (^com.google.cloud.dns.Dns$RecordSetListOption [^java.lang.String page-token]
    (Dns$RecordSetListOption/pageToken page-token)))

(defn *page-size
  "The maximum number of record sets to return per RPC.

   The server can return fewer record sets than requested. When there are more results than
   the page size, the server will return a page token that can be used to fetch other results.

  page-size - `int`

  returns: `com.google.cloud.dns.Dns$RecordSetListOption`"
  (^com.google.cloud.dns.Dns$RecordSetListOption [^Integer page-size]
    (Dns$RecordSetListOption/pageSize page-size)))

(defn *dns-name
  "Restricts the list to only record sets with this fully qualified domain name.

  dns-name - `java.lang.String`

  returns: `com.google.cloud.dns.Dns$RecordSetListOption`"
  (^com.google.cloud.dns.Dns$RecordSetListOption [^java.lang.String dns-name]
    (Dns$RecordSetListOption/dnsName dns-name)))

(defn *type
  "Restricts the list to return only record sets of this type. If present, dnsName(String) must also be present.

  type - `com.google.cloud.dns.RecordSet$Type`

  returns: `com.google.cloud.dns.Dns$RecordSetListOption`"
  (^com.google.cloud.dns.Dns$RecordSetListOption [^com.google.cloud.dns.RecordSet$Type type]
    (Dns$RecordSetListOption/type type)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Dns$RecordSetListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Dns$RecordSetListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Dns$RecordSetListOption this]
    (-> this (.toString))))

