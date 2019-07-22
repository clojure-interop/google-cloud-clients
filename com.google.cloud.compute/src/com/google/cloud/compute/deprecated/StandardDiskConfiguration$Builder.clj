(ns com.google.cloud.compute.deprecated.StandardDiskConfiguration$Builder
  "A builder for StandardDiskConfiguration objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated StandardDiskConfiguration$Builder]))

(defn set-size-gb
  "Sets the size of the persistent disk, in GB. If not set, 500GB is used.

  size-gb - `java.lang.Long`

  returns: `com.google.cloud.compute.deprecated.StandardDiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.StandardDiskConfiguration$Builder [^StandardDiskConfiguration$Builder this ^java.lang.Long size-gb]
    (-> this (.setSizeGb size-gb))))

(defn build
  "Creates a StandardDiskConfiguration object.

  returns: `com.google.cloud.compute.deprecated.StandardDiskConfiguration`"
  (^com.google.cloud.compute.deprecated.StandardDiskConfiguration [^StandardDiskConfiguration$Builder this]
    (-> this (.build))))

