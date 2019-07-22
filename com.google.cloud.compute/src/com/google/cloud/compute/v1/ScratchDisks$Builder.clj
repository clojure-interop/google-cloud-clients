(ns com.google.cloud.compute.v1.ScratchDisks$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ScratchDisks$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.ScratchDisks`

  returns: `com.google.cloud.compute.v1.ScratchDisks$Builder`"
  (^com.google.cloud.compute.v1.ScratchDisks$Builder [^ScratchDisks$Builder this ^com.google.cloud.compute.v1.ScratchDisks other]
    (-> this (.mergeFrom other))))

(defn get-disk-gb
  "Size of the scratch disk, defined in GB.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^ScratchDisks$Builder this]
    (-> this (.getDiskGb))))

(defn set-disk-gb
  "Size of the scratch disk, defined in GB.

  disk-gb - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.ScratchDisks$Builder`"
  (^com.google.cloud.compute.v1.ScratchDisks$Builder [^ScratchDisks$Builder this ^java.lang.Integer disk-gb]
    (-> this (.setDiskGb disk-gb))))

(defn build
  "returns: `com.google.cloud.compute.v1.ScratchDisks`"
  (^com.google.cloud.compute.v1.ScratchDisks [^ScratchDisks$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.ScratchDisks$Builder`"
  (^com.google.cloud.compute.v1.ScratchDisks$Builder [^ScratchDisks$Builder this]
    (-> this (.clone))))

