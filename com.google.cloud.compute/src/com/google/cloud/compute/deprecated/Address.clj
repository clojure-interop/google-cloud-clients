(ns com.google.cloud.compute.deprecated.Address
  "A Google Compute Engine address. With Compute Engine you can create static external IP addresses
  that are assigned to your project and persist until you explicitly release them. A region address
  can be assigned to a Compute Engine instance or to a regional forwarding rule. Compute Engine
  also allows you to create global addresses that are used for global forwarding rules. Both global
  addresses and global forwarding rules can only be used for HTTP load balancing. Address
  adds a layer of service-related functionality over AddressInfo. Objects of this class are
  immutable. To get an Address object with the most recent information use reload(com.google.cloud.compute.deprecated.Compute.AddressOption...)."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Address]))

(defn exists?
  "Checks if this address exists.

  returns: true if this address exists, false otherwise - `boolean`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^Boolean [^Address this]
    (-> this (.exists))))

(defn reload
  "Fetches the current address' latest information. Returns null if the address does not
   exist.

  options - address options - `com.google.cloud.compute.deprecated.Compute$AddressOption`

  returns: an Address object with latest information or null if not found - `com.google.cloud.compute.deprecated.Address`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Address [^Address this ^com.google.cloud.compute.deprecated.Compute$AddressOption options]
    (-> this (.reload options))))

(defn delete
  "Deletes this address.

  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: an Operation object if delete request was successfully sent, null if
       the address was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Address this ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.delete options))))

(defn get-compute
  "Returns the address's Compute object used to issue requests.

  returns: `com.google.cloud.compute.deprecated.Compute`"
  (^com.google.cloud.compute.deprecated.Compute [^Address this]
    (-> this (.getCompute))))

(defn to-builder
  "Description copied from class: AddressInfo

  returns: `com.google.cloud.compute.deprecated.Address$Builder`"
  (^com.google.cloud.compute.deprecated.Address$Builder [^Address this]
    (-> this (.toBuilder))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Address this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Address this]
    (-> this (.hashCode))))

