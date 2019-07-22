(ns com.google.cloud.compute.deprecated.testing.ResourceCleaner
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated.testing ResourceCleaner]))

(defn *create
  "compute - `com.google.cloud.compute.deprecated.Compute`

  returns: `com.google.cloud.compute.deprecated.testing.ResourceCleaner`"
  (^com.google.cloud.compute.deprecated.testing.ResourceCleaner [^com.google.cloud.compute.deprecated.Compute compute]
    (ResourceCleaner/create compute)))

(defn clean-up
  ""
  ([^ResourceCleaner this]
    (-> this (.cleanUp))))

(defn add
  "address-id - `com.google.cloud.compute.deprecated.AddressId`"
  ([^ResourceCleaner this ^com.google.cloud.compute.deprecated.AddressId address-id]
    (-> this (.add address-id))))

(defn remove
  "resource-id - `java.lang.Object`

  returns: `com.google.cloud.compute.deprecated.testing.ResourceCleaner`"
  (^com.google.cloud.compute.deprecated.testing.ResourceCleaner [^ResourceCleaner this ^java.lang.Object resource-id]
    (-> this (.remove resource-id))))

