(ns com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ShieldedInstanceIntegrityPolicy$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy`

  returns: `com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy$Builder`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy$Builder [^ShieldedInstanceIntegrityPolicy$Builder this ^com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy other]
    (-> this (.mergeFrom other))))

(defn get-update-auto-learn-policy?
  "Updates the integrity policy baseline using the measurements from the VM instance's most
   recent boot.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^ShieldedInstanceIntegrityPolicy$Builder this]
    (-> this (.getUpdateAutoLearnPolicy))))

(defn set-update-auto-learn-policy
  "Updates the integrity policy baseline using the measurements from the VM instance's most
   recent boot.

  update-auto-learn-policy - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy$Builder`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy$Builder [^ShieldedInstanceIntegrityPolicy$Builder this ^java.lang.Boolean update-auto-learn-policy]
    (-> this (.setUpdateAutoLearnPolicy update-auto-learn-policy))))

(defn build
  "returns: `com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy [^ShieldedInstanceIntegrityPolicy$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy$Builder`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy$Builder [^ShieldedInstanceIntegrityPolicy$Builder this]
    (-> this (.clone))))

