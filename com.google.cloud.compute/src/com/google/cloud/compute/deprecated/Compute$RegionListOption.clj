(ns com.google.cloud.compute.deprecated.Compute$RegionListOption
  "Class for specifying region list options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$RegionListOption]))

(defn *filter
  "Returns an option to specify a filter on the regions being listed.

  filter - `com.google.cloud.compute.deprecated.Compute$RegionFilter`

  returns: `com.google.cloud.compute.deprecated.Compute$RegionListOption`"
  (^com.google.cloud.compute.deprecated.Compute$RegionListOption [^com.google.cloud.compute.deprecated.Compute$RegionFilter filter]
    (Compute$RegionListOption/filter filter)))

(defn *page-size
  "Returns an option to specify the maximum number of regions returned per page. pageSize must be between 0 and 500 (inclusive). If not specified 500 is used.

  page-size - `long`

  returns: `com.google.cloud.compute.deprecated.Compute$RegionListOption`"
  (^com.google.cloud.compute.deprecated.Compute$RegionListOption [^Long page-size]
    (Compute$RegionListOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start listing regions.

  page-token - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$RegionListOption`"
  (^com.google.cloud.compute.deprecated.Compute$RegionListOption [^java.lang.String page-token]
    (Compute$RegionListOption/pageToken page-token)))

(defn *fields
  "Returns an option to specify the region's fields to be returned by the RPC call. If this
   option is not provided, all region's fields are returned. RegionListOption.fields can
   be used to specify only the fields of interest. Region.getRegionId() is always
   returned, even if not specified.

  fields - `com.google.cloud.compute.deprecated.Compute$RegionField`

  returns: `com.google.cloud.compute.deprecated.Compute$RegionListOption`"
  (^com.google.cloud.compute.deprecated.Compute$RegionListOption [^com.google.cloud.compute.deprecated.Compute$RegionField fields]
    (Compute$RegionListOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$RegionListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$RegionListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$RegionListOption this]
    (-> this (.toString))))

