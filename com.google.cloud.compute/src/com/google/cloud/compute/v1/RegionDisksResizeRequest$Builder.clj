(ns com.google.cloud.compute.v1.RegionDisksResizeRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionDisksResizeRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.RegionDisksResizeRequest`

  returns: `com.google.cloud.compute.v1.RegionDisksResizeRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionDisksResizeRequest$Builder [^RegionDisksResizeRequest$Builder this ^com.google.cloud.compute.v1.RegionDisksResizeRequest other]
    (-> this (.mergeFrom other))))

(defn get-size-gb
  "The new size of the regional persistent disk, which is specified in GB.

  returns: `java.lang.String`"
  (^java.lang.String [^RegionDisksResizeRequest$Builder this]
    (-> this (.getSizeGb))))

(defn set-size-gb
  "The new size of the regional persistent disk, which is specified in GB.

  size-gb - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RegionDisksResizeRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionDisksResizeRequest$Builder [^RegionDisksResizeRequest$Builder this ^java.lang.String size-gb]
    (-> this (.setSizeGb size-gb))))

(defn build
  "returns: `com.google.cloud.compute.v1.RegionDisksResizeRequest`"
  (^com.google.cloud.compute.v1.RegionDisksResizeRequest [^RegionDisksResizeRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.RegionDisksResizeRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionDisksResizeRequest$Builder [^RegionDisksResizeRequest$Builder this]
    (-> this (.clone))))

