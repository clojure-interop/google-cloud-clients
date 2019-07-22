(ns com.google.cloud.compute.deprecated.Subnetwork
  "A Google Compute Engine Subnetwork. Subnetworks segments your cloud network IP space into
  subnetworks. Subnetwork prefixes can be automatically allocated, or you can create a custom
  topology. Objects of this class are immutable. To get a Subnetwork object with the most
  recent information use reload(com.google.cloud.compute.deprecated.Compute.SubnetworkOption...). Subnetwork adds a layer of service-related
  functionality over SubnetworkInfo."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Subnetwork]))

(defn exists?
  "Checks if this subnetwork exists.

  returns: true if this subnetwork exists, false otherwise - `boolean`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^Boolean [^Subnetwork this]
    (-> this (.exists))))

(defn reload
  "Fetches current subnetwork' latest information. Returns null if the subnetwork does not
   exist.

  options - subnetwork options - `com.google.cloud.compute.deprecated.Compute$SubnetworkOption`

  returns: an Subnetwork object with latest information or null if not found - `com.google.cloud.compute.deprecated.Subnetwork`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Subnetwork [^Subnetwork this ^com.google.cloud.compute.deprecated.Compute$SubnetworkOption options]
    (-> this (.reload options))))

(defn delete
  "Deletes this subnetwork. If this subnetwork was auto-generated deletion will fail.

  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: an operation object if delete request was successfully sent, null if the
       subnetwork was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Subnetwork this ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.delete options))))

(defn get-compute
  "Returns the subnetwork's Compute object used to issue requests.

  returns: `com.google.cloud.compute.deprecated.Compute`"
  (^com.google.cloud.compute.deprecated.Compute [^Subnetwork this]
    (-> this (.getCompute))))

(defn to-builder
  "Description copied from class: SubnetworkInfo

  returns: `com.google.cloud.compute.deprecated.Subnetwork$Builder`"
  (^com.google.cloud.compute.deprecated.Subnetwork$Builder [^Subnetwork this]
    (-> this (.toBuilder))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Subnetwork this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Subnetwork this]
    (-> this (.hashCode))))

