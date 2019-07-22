(ns com.google.cloud.dns.Dns$ZoneListOption
  "Class for specifying zone listing options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns Dns$ZoneListOption]))

(defn *fields
  "Returns an option to specify the zones's fields to be returned by the RPC call.

   If this option is not provided all zone fields are returned. ZoneOption.fields can
   be used to specify only the fields of interest. Zone ID is always returned, even if not
   specified. Dns.ZoneField provides a list of fields that can be used.

  fields - `com.google.cloud.dns.Dns$ZoneField`

  returns: `com.google.cloud.dns.Dns$ZoneListOption`"
  (^com.google.cloud.dns.Dns$ZoneListOption [^com.google.cloud.dns.Dns$ZoneField fields]
    (Dns$ZoneListOption/fields fields)))

(defn *page-token
  "Returns an option to specify a page token.

   The page token (returned from a previous call to list) indicates from where listing should
   continue.

  page-token - `java.lang.String`

  returns: `com.google.cloud.dns.Dns$ZoneListOption`"
  (^com.google.cloud.dns.Dns$ZoneListOption [^java.lang.String page-token]
    (Dns$ZoneListOption/pageToken page-token)))

(defn *dns-name
  "Restricts the list to only zone with this fully qualified domain name.

  dns-name - `java.lang.String`

  returns: `com.google.cloud.dns.Dns$ZoneListOption`"
  (^com.google.cloud.dns.Dns$ZoneListOption [^java.lang.String dns-name]
    (Dns$ZoneListOption/dnsName dns-name)))

(defn *page-size
  "The maximum number of zones to return per RPC.

   The server can return fewer zones than requested. When there are more results than the
   page size, the server will return a page token that can be used to fetch other results.

  page-size - `int`

  returns: `com.google.cloud.dns.Dns$ZoneListOption`"
  (^com.google.cloud.dns.Dns$ZoneListOption [^Integer page-size]
    (Dns$ZoneListOption/pageSize page-size)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Dns$ZoneListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Dns$ZoneListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Dns$ZoneListOption this]
    (-> this (.toString))))

