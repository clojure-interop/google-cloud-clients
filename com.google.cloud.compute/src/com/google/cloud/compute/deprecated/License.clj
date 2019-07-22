(ns com.google.cloud.compute.deprecated.License
  "A Google Compute Engine License. A License represents a software license. Licenses are used to
  track software usage in images, persistent disks, snapshots, and virtual machine instances."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated License]))

(defn get-license-id
  "Returns the identity of the license.

  returns: `com.google.cloud.compute.deprecated.LicenseId`"
  (^com.google.cloud.compute.deprecated.LicenseId [^License this]
    (-> this (.getLicenseId))))

(defn charges-use-fee
  "Returns true if the customer will be charged a license fee for running software that
   contains this license on an instance.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^License this]
    (-> this (.chargesUseFee))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^License this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^License this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^License this ^java.lang.Object obj]
    (-> this (.equals obj))))

