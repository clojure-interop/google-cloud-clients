(ns com.google.cloud.compute.v1.LicenseResourceRequirements$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 LicenseResourceRequirements$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.LicenseResourceRequirements`

  returns: `com.google.cloud.compute.v1.LicenseResourceRequirements$Builder`"
  (^com.google.cloud.compute.v1.LicenseResourceRequirements$Builder [^LicenseResourceRequirements$Builder this ^com.google.cloud.compute.v1.LicenseResourceRequirements other]
    (-> this (.mergeFrom other))))

(defn get-min-guest-cpu-count
  "Minimum number of guest cpus required to use the Instance. Enforced at Instance creation and
   Instance start.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^LicenseResourceRequirements$Builder this]
    (-> this (.getMinGuestCpuCount))))

(defn set-min-guest-cpu-count
  "Minimum number of guest cpus required to use the Instance. Enforced at Instance creation and
   Instance start.

  min-guest-cpu-count - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.LicenseResourceRequirements$Builder`"
  (^com.google.cloud.compute.v1.LicenseResourceRequirements$Builder [^LicenseResourceRequirements$Builder this ^java.lang.Integer min-guest-cpu-count]
    (-> this (.setMinGuestCpuCount min-guest-cpu-count))))

(defn get-min-memory-mb
  "Minimum memory required to use the Instance. Enforced at Instance creation and Instance
   start.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^LicenseResourceRequirements$Builder this]
    (-> this (.getMinMemoryMb))))

(defn set-min-memory-mb
  "Minimum memory required to use the Instance. Enforced at Instance creation and Instance
   start.

  min-memory-mb - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.LicenseResourceRequirements$Builder`"
  (^com.google.cloud.compute.v1.LicenseResourceRequirements$Builder [^LicenseResourceRequirements$Builder this ^java.lang.Integer min-memory-mb]
    (-> this (.setMinMemoryMb min-memory-mb))))

(defn build
  "returns: `com.google.cloud.compute.v1.LicenseResourceRequirements`"
  (^com.google.cloud.compute.v1.LicenseResourceRequirements [^LicenseResourceRequirements$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.LicenseResourceRequirements$Builder`"
  (^com.google.cloud.compute.v1.LicenseResourceRequirements$Builder [^LicenseResourceRequirements$Builder this]
    (-> this (.clone))))

