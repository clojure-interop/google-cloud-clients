(ns com.google.cloud.compute.deprecated.AddressInfo
  "A Google Compute Engine address. With Compute Engine you can create static external IP addresses
  that are assigned to your project and persist until you explicitly release them. A region address
  can be assigned to a Compute Engine instance or to a regional forwarding rule. To create a region
  address, use a RegionAddressId identity. Compute Engine also allows you to create global
  addresses that are used for global forwarding rules. Both global addresses and global forwarding
  rules can only be used for HTTP load balancing. To create a global address, use a GlobalAddressId identity."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated AddressInfo]))

(defn *new-builder
  "Returns a builder for the AddressInfo object given it's identity.

  address-id - `com.google.cloud.compute.deprecated.AddressId`

  returns: `com.google.cloud.compute.deprecated.AddressInfo$Builder`"
  (^com.google.cloud.compute.deprecated.AddressInfo$Builder [^com.google.cloud.compute.deprecated.AddressId address-id]
    (AddressInfo/newBuilder address-id)))

(defn *of
  "Returns an AddressInfo object for the provided region identity and name. The object
   corresponds to a region address.

  region-id - `com.google.cloud.compute.deprecated.RegionId`
  name - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.AddressInfo`"
  (^com.google.cloud.compute.deprecated.AddressInfo [^com.google.cloud.compute.deprecated.RegionId region-id ^java.lang.String name]
    (AddressInfo/of region-id name))
  (^com.google.cloud.compute.deprecated.AddressInfo [^com.google.cloud.compute.deprecated.AddressId address-id]
    (AddressInfo/of address-id)))

(defn get-status
  "Returns the status of the address.

  returns: `com.google.cloud.compute.deprecated.AddressInfo$Status`"
  (^com.google.cloud.compute.deprecated.AddressInfo$Status [^AddressInfo this]
    (-> this (.getStatus))))

(defn get-address-id
  "Returns the address identity. Returns GlobalAddressId for a global address, returns
   RegionAddressId for a region address.

  returns: `<T extends com.google.cloud.compute.deprecated.AddressId> T`"
  ([^AddressInfo this]
    (-> this (.getAddressId))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AddressInfo this]
    (-> this (.toString))))

(defn get-address
  "Returns the static external IP address represented by this object.

  returns: `java.lang.String`"
  (^java.lang.String [^AddressInfo this]
    (-> this (.getAddress))))

(defn get-usage
  "Returns the usage information of the address. Returns an AddressInfo.InstanceUsage object for
   region addresses that are assigned to VM instances. Returns a AddressInfo.RegionForwardingUsage
   object for region addresses assigned to region forwarding rules. Returns a AddressInfo.GlobalForwardingUsage object for global addresses assigned to global forwarding rules. Returns
   null if the address is not in use.

  returns: `<T extends com.google.cloud.compute.deprecated.AddressInfo$Usage> T`"
  ([^AddressInfo this]
    (-> this (.getUsage))))

(defn get-description
  "Returns an optional textual description of the address.

  returns: `java.lang.String`"
  (^java.lang.String [^AddressInfo this]
    (-> this (.getDescription))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AddressInfo this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "Returns the creation timestamp in milliseconds since epoch.

  returns: `java.lang.Long`"
  (^java.lang.Long [^AddressInfo this]
    (-> this (.getCreationTimestamp))))

(defn get-generated-id
  "Returns the service-generated unique identifier for the address.

  returns: `java.lang.String`"
  (^java.lang.String [^AddressInfo this]
    (-> this (.getGeneratedId))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AddressInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-builder
  "Returns a builder for the AddressInfo object.

  returns: `com.google.cloud.compute.deprecated.AddressInfo$Builder`"
  (^com.google.cloud.compute.deprecated.AddressInfo$Builder [^AddressInfo this]
    (-> this (.toBuilder))))

