(ns com.google.cloud.compute.v1.NetworkEndpoint$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworkEndpoint$Builder]))

(defn get-ip-address
  "Optional IPv4 address of network endpoint. The IP address must belong to a VM in GCE (either
   the primary IP or as part of an aliased IP range). If the IP address is not specified, then
   the primary IP address for the VM instance in the network that the network endpoint group
   belongs to will be used.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpoint$Builder this]
    (-> this (.getIpAddress))))

(defn get-instance
  "The name for a specific VM instance that the IP address belongs to. This is required for
   network endpoints of type GCE_VM_IP_PORT. The instance must be in the same zone of network
   endpoint group.

   The name must be 1-63 characters long, and comply with RFC1035.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpoint$Builder this]
    (-> this (.getInstance))))

(defn build
  "returns: `com.google.cloud.compute.v1.NetworkEndpoint`"
  (^com.google.cloud.compute.v1.NetworkEndpoint [^NetworkEndpoint$Builder this]
    (-> this (.build))))

(defn set-port
  "Optional port number of network endpoint. If not specified and the
   NetworkEndpointGroup.network_endpoint_type is GCE_IP_PORT, the defaultPort for the network
   endpoint group will be used.

  port - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.NetworkEndpoint$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpoint$Builder [^NetworkEndpoint$Builder this ^java.lang.Integer port]
    (-> this (.setPort port))))

(defn set-ip-address
  "Optional IPv4 address of network endpoint. The IP address must belong to a VM in GCE (either
   the primary IP or as part of an aliased IP range). If the IP address is not specified, then
   the primary IP address for the VM instance in the network that the network endpoint group
   belongs to will be used.

  ip-address - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NetworkEndpoint$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpoint$Builder [^NetworkEndpoint$Builder this ^java.lang.String ip-address]
    (-> this (.setIpAddress ip-address))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.NetworkEndpoint`

  returns: `com.google.cloud.compute.v1.NetworkEndpoint$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpoint$Builder [^NetworkEndpoint$Builder this ^com.google.cloud.compute.v1.NetworkEndpoint other]
    (-> this (.mergeFrom other))))

(defn set-instance
  "The name for a specific VM instance that the IP address belongs to. This is required for
   network endpoints of type GCE_VM_IP_PORT. The instance must be in the same zone of network
   endpoint group.

   The name must be 1-63 characters long, and comply with RFC1035.

  instance - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NetworkEndpoint$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpoint$Builder [^NetworkEndpoint$Builder this ^java.lang.String instance]
    (-> this (.setInstance instance))))

(defn get-port
  "Optional port number of network endpoint. If not specified and the
   NetworkEndpointGroup.network_endpoint_type is GCE_IP_PORT, the defaultPort for the network
   endpoint group will be used.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^NetworkEndpoint$Builder this]
    (-> this (.getPort))))

(defn clone
  "returns: `com.google.cloud.compute.v1.NetworkEndpoint$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpoint$Builder [^NetworkEndpoint$Builder this]
    (-> this (.clone))))

