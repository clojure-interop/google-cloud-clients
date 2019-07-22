(ns com.google.cloud.compute.v1.NetworkEndpoint
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworkEndpoint]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.NetworkEndpoint`

  returns: `com.google.cloud.compute.v1.NetworkEndpoint$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpoint$Builder [^com.google.cloud.compute.v1.NetworkEndpoint prototype]
    (NetworkEndpoint/newBuilder prototype))
  (^com.google.cloud.compute.v1.NetworkEndpoint$Builder []
    (NetworkEndpoint/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.NetworkEndpoint`"
  (^com.google.cloud.compute.v1.NetworkEndpoint []
    (NetworkEndpoint/getDefaultInstance )))

(defn get-ip-address
  "Optional IPv4 address of network endpoint. The IP address must belong to a VM in GCE (either
   the primary IP or as part of an aliased IP range). If the IP address is not specified, then the
   primary IP address for the VM instance in the network that the network endpoint group belongs
   to will be used.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpoint this]
    (-> this (.getIpAddress))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NetworkEndpoint this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpoint this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^NetworkEndpoint this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-instance
  "The name for a specific VM instance that the IP address belongs to. This is required for
   network endpoints of type GCE_VM_IP_PORT. The instance must be in the same zone of network
   endpoint group.

   The name must be 1-63 characters long, and comply with RFC1035.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpoint this]
    (-> this (.getInstance))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^NetworkEndpoint this]
    (-> this (.getApiMessageRequestBody))))

(defn get-port
  "Optional port number of network endpoint. If not specified and the
   NetworkEndpointGroup.network_endpoint_type is GCE_IP_PORT, the defaultPort for the network
   endpoint group will be used.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^NetworkEndpoint this]
    (-> this (.getPort))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NetworkEndpoint this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NetworkEndpoint this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.NetworkEndpoint$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpoint$Builder [^NetworkEndpoint this]
    (-> this (.toBuilder))))

