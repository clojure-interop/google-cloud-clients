(ns com.google.cloud.compute.v1.SourceInstanceParams$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SourceInstanceParams$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.SourceInstanceParams`

  returns: `com.google.cloud.compute.v1.SourceInstanceParams$Builder`"
  (^com.google.cloud.compute.v1.SourceInstanceParams$Builder [^SourceInstanceParams$Builder this ^com.google.cloud.compute.v1.SourceInstanceParams other]
    (-> this (.mergeFrom other))))

(defn get-disk-configs-list
  "Attached disks configuration. If not provided, defaults are applied: For boot disk and any
   other R/W disks, new custom images will be created from each disk. For read-only disks, they
   will be attached in read-only mode. Local SSD disks will be created as blank volumes.

  returns: `java.util.List<com.google.cloud.compute.v1.DiskInstantiationConfig>`"
  (^java.util.List [^SourceInstanceParams$Builder this]
    (-> this (.getDiskConfigsList))))

(defn add-all-disk-configs
  "Attached disks configuration. If not provided, defaults are applied: For boot disk and any
   other R/W disks, new custom images will be created from each disk. For read-only disks, they
   will be attached in read-only mode. Local SSD disks will be created as blank volumes.

  disk-configs - `java.util.List`

  returns: `com.google.cloud.compute.v1.SourceInstanceParams$Builder`"
  (^com.google.cloud.compute.v1.SourceInstanceParams$Builder [^SourceInstanceParams$Builder this ^java.util.List disk-configs]
    (-> this (.addAllDiskConfigs disk-configs))))

(defn add-disk-configs
  "Attached disks configuration. If not provided, defaults are applied: For boot disk and any
   other R/W disks, new custom images will be created from each disk. For read-only disks, they
   will be attached in read-only mode. Local SSD disks will be created as blank volumes.

  disk-configs - `com.google.cloud.compute.v1.DiskInstantiationConfig`

  returns: `com.google.cloud.compute.v1.SourceInstanceParams$Builder`"
  (^com.google.cloud.compute.v1.SourceInstanceParams$Builder [^SourceInstanceParams$Builder this ^com.google.cloud.compute.v1.DiskInstantiationConfig disk-configs]
    (-> this (.addDiskConfigs disk-configs))))

(defn build
  "returns: `com.google.cloud.compute.v1.SourceInstanceParams`"
  (^com.google.cloud.compute.v1.SourceInstanceParams [^SourceInstanceParams$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.SourceInstanceParams$Builder`"
  (^com.google.cloud.compute.v1.SourceInstanceParams$Builder [^SourceInstanceParams$Builder this]
    (-> this (.clone))))

