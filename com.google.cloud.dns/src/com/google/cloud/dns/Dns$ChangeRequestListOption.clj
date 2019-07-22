(ns com.google.cloud.dns.Dns$ChangeRequestListOption
  "Class for specifying change request listing options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns Dns$ChangeRequestListOption]))

(defn *fields
  "Returns an option to specify which fields ofChangeRequest should be returned by the
   service.

   If this option is not provided all change request fields are returned. ChangeRequestOption.fields can be used to specify only the fields of interest. The ID of the
   change request is always returned, even if not specified. Dns.ChangeRequestField provides
   a list of fields that can be used.

  fields - `com.google.cloud.dns.Dns$ChangeRequestField`

  returns: `com.google.cloud.dns.Dns$ChangeRequestListOption`"
  (^com.google.cloud.dns.Dns$ChangeRequestListOption [^com.google.cloud.dns.Dns$ChangeRequestField fields]
    (Dns$ChangeRequestListOption/fields fields)))

(defn *page-token
  "Returns an option to specify a page token.

   The page token (returned from a previous call to list) indicates from where listing should
   continue.

  page-token - `java.lang.String`

  returns: `com.google.cloud.dns.Dns$ChangeRequestListOption`"
  (^com.google.cloud.dns.Dns$ChangeRequestListOption [^java.lang.String page-token]
    (Dns$ChangeRequestListOption/pageToken page-token)))

(defn *page-size
  "The maximum number of change requests to return per RPC.

   The server can return fewer change requests than requested. When there are more results
   than the page size, the server will return a page token that can be used to fetch other
   results.

  page-size - `int`

  returns: `com.google.cloud.dns.Dns$ChangeRequestListOption`"
  (^com.google.cloud.dns.Dns$ChangeRequestListOption [^Integer page-size]
    (Dns$ChangeRequestListOption/pageSize page-size)))

(defn *sort-order
  "Returns an option to specify whether the the change requests should be listed in ascending
   (most-recent last) or descending (most-recent first) order with respect to when the change
   request was accepted by the server. If this option is not provided, the listing order is
   undefined.

  order - `com.google.cloud.dns.Dns$SortingOrder`

  returns: `com.google.cloud.dns.Dns$ChangeRequestListOption`"
  (^com.google.cloud.dns.Dns$ChangeRequestListOption [^com.google.cloud.dns.Dns$SortingOrder order]
    (Dns$ChangeRequestListOption/sortOrder order)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Dns$ChangeRequestListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Dns$ChangeRequestListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Dns$ChangeRequestListOption this]
    (-> this (.toString))))

