(ns com.google.cloud.compute.deprecated.Network
  "A Google Compute Engine Network. Every virtual machine instance is created as a member of a
  network. Networks connect instances to each other and to the Internet. You can segment your
  networks, use firewall rules to restrict access to instances, and create static routes to forward
  traffic to specific destinations. Objects of this class are immutable. To get a Network
  object with the most recent information use reload(com.google.cloud.compute.deprecated.Compute.NetworkOption...). Network adds a layer of
  service-related functionality over NetworkInfo."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Network]))

(defn exists?
  "Checks if this network exists.

  returns: true if this network exists, false otherwise - `boolean`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^Boolean [^Network this]
    (-> this (.exists))))

(defn reload
  "Fetches current network' latest information. Returns null if the network does not
   exist.

  options - network options - `com.google.cloud.compute.deprecated.Compute$NetworkOption`

  returns: a Network object with latest information or null if not found - `com.google.cloud.compute.deprecated.Network`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Network [^Network this ^com.google.cloud.compute.deprecated.Compute$NetworkOption options]
    (-> this (.reload options))))

(defn delete
  "Deletes this network.

  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: an operation object if delete request was successfully sent, null if the
       network was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Network this ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.delete options))))

(defn create-subnetwork
  "Creates a subnetwork for this network given its identity and the range of IPv4 addresses in
   CIDR format. Subnetwork creation is only supported for networks in \"custom subnet mode\" (i.e.
   NetworkInfo.getConfiguration() returns a SubnetNetworkConfiguration) with automatic
   creation of subnetworks disabled (i.e. SubnetNetworkConfiguration.autoCreateSubnetworks() returns false).

  subnetwork-id - `com.google.cloud.compute.deprecated.SubnetworkId`
  ip-range - `java.lang.String`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: an operation object if creation request was successfully sent - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Network this ^com.google.cloud.compute.deprecated.SubnetworkId subnetwork-id ^java.lang.String ip-range ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.createSubnetwork subnetwork-id ip-range options))))

(defn get-compute
  "Returns the network's Compute object used to issue requests.

  returns: `com.google.cloud.compute.deprecated.Compute`"
  (^com.google.cloud.compute.deprecated.Compute [^Network this]
    (-> this (.getCompute))))

(defn to-builder
  "Description copied from class: NetworkInfo

  returns: `com.google.cloud.compute.deprecated.Network$Builder`"
  (^com.google.cloud.compute.deprecated.Network$Builder [^Network this]
    (-> this (.toBuilder))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Network this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Network this]
    (-> this (.hashCode))))

