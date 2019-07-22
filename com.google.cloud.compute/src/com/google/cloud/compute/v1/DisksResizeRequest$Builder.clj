(ns com.google.cloud.compute.v1.DisksResizeRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 DisksResizeRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.DisksResizeRequest`

  returns: `com.google.cloud.compute.v1.DisksResizeRequest$Builder`"
  (^com.google.cloud.compute.v1.DisksResizeRequest$Builder [^DisksResizeRequest$Builder this ^com.google.cloud.compute.v1.DisksResizeRequest other]
    (-> this (.mergeFrom other))))

(defn get-size-gb
  "The new size of the persistent disk, which is specified in GB.

  returns: `java.lang.String`"
  (^java.lang.String [^DisksResizeRequest$Builder this]
    (-> this (.getSizeGb))))

(defn set-size-gb
  "The new size of the persistent disk, which is specified in GB.

  size-gb - `java.lang.String`

  returns: `com.google.cloud.compute.v1.DisksResizeRequest$Builder`"
  (^com.google.cloud.compute.v1.DisksResizeRequest$Builder [^DisksResizeRequest$Builder this ^java.lang.String size-gb]
    (-> this (.setSizeGb size-gb))))

(defn build
  "returns: `com.google.cloud.compute.v1.DisksResizeRequest`"
  (^com.google.cloud.compute.v1.DisksResizeRequest [^DisksResizeRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.DisksResizeRequest$Builder`"
  (^com.google.cloud.compute.v1.DisksResizeRequest$Builder [^DisksResizeRequest$Builder this]
    (-> this (.clone))))

