(ns com.google.cloud.compute.deprecated.Compute$ImageListOption
  "Class for specifying image list options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$ImageListOption]))

(defn *filter
  "Returns an option to specify a filter on the images being listed.

  filter - `com.google.cloud.compute.deprecated.Compute$ImageFilter`

  returns: `com.google.cloud.compute.deprecated.Compute$ImageListOption`"
  (^com.google.cloud.compute.deprecated.Compute$ImageListOption [^com.google.cloud.compute.deprecated.Compute$ImageFilter filter]
    (Compute$ImageListOption/filter filter)))

(defn *page-size
  "Returns an option to specify the maximum number of images returned per page. pageSize
   must be between 0 and 500 (inclusive). If not specified 500 is used.

  page-size - `long`

  returns: `com.google.cloud.compute.deprecated.Compute$ImageListOption`"
  (^com.google.cloud.compute.deprecated.Compute$ImageListOption [^Long page-size]
    (Compute$ImageListOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start listing images.

  page-token - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$ImageListOption`"
  (^com.google.cloud.compute.deprecated.Compute$ImageListOption [^java.lang.String page-token]
    (Compute$ImageListOption/pageToken page-token)))

(defn *fields
  "Returns an option to specify the image's fields to be returned by the RPC call. If this
   option is not provided, all image's fields are returned. ImageListOption.fields can
   be used to specify only the fields of interest. ImageInfo.getImageId() and ImageInfo.getConfiguration() are always returned, even if not specified.

  fields - `com.google.cloud.compute.deprecated.Compute$ImageField`

  returns: `com.google.cloud.compute.deprecated.Compute$ImageListOption`"
  (^com.google.cloud.compute.deprecated.Compute$ImageListOption [^com.google.cloud.compute.deprecated.Compute$ImageField fields]
    (Compute$ImageListOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Compute$ImageListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Compute$ImageListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Compute$ImageListOption this]
    (-> this (.toString))))

