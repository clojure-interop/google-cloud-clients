(ns com.google.cloud.compute.deprecated.Compute$ZoneListOption
  "Class for specifying zone list options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$ZoneListOption]))

(defn *filter
  "Returns an option to specify a filter on the zones being listed.

  filter - `com.google.cloud.compute.deprecated.Compute$ZoneFilter`

  returns: `com.google.cloud.compute.deprecated.Compute$ZoneListOption`"
  (^com.google.cloud.compute.deprecated.Compute$ZoneListOption [^com.google.cloud.compute.deprecated.Compute$ZoneFilter filter]
    (Compute$ZoneListOption/filter filter)))

(defn *page-size
  "Returns an option to specify the maximum number of zones returned per page. pageSize
   must be between 0 and 500 (inclusive). If not specified 500 is used.

  page-size - `long`

  returns: `com.google.cloud.compute.deprecated.Compute$ZoneListOption`"
  (^com.google.cloud.compute.deprecated.Compute$ZoneListOption [^Long page-size]
    (Compute$ZoneListOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start listing zones.

  page-token - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$ZoneListOption`"
  (^com.google.cloud.compute.deprecated.Compute$ZoneListOption [^java.lang.String page-token]
    (Compute$ZoneListOption/pageToken page-token)))

(defn *fields
  "Returns an option to specify the zone's fields to be returned by the RPC call. If this option
   is not provided, all zone's fields are returned. ZoneListOption.fields can be used to
   specify only the fields of interest. Zone.getZoneId() is always returned, even if not
   specified.

  fields - `com.google.cloud.compute.deprecated.Compute$ZoneField`

  returns: `com.google.cloud.compute.deprecated.Compute$ZoneListOption`"
  (^com.google.cloud.compute.deprecated.Compute$ZoneListOption [^com.google.cloud.compute.deprecated.Compute$ZoneField fields]
    (Compute$ZoneListOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$ZoneListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$ZoneListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$ZoneListOption this]
    (-> this (.toString))))

