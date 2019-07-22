(ns com.google.cloud.compute.v1.NetworksAddPeeringRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworksAddPeeringRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.NetworksAddPeeringRequest`

  returns: `com.google.cloud.compute.v1.NetworksAddPeeringRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworksAddPeeringRequest$Builder [^com.google.cloud.compute.v1.NetworksAddPeeringRequest prototype]
    (NetworksAddPeeringRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.NetworksAddPeeringRequest$Builder []
    (NetworksAddPeeringRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.NetworksAddPeeringRequest`"
  (^com.google.cloud.compute.v1.NetworksAddPeeringRequest []
    (NetworksAddPeeringRequest/getDefaultInstance )))

(defn get-peer-network
  "URL of the peer network. It can be either full URL or partial URL. The peer network may belong
   to a different project. If the partial URL does not contain project, it is assumed that the
   peer network is in the same project as the current network.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworksAddPeeringRequest this]
    (-> this (.getPeerNetwork))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NetworksAddPeeringRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NetworksAddPeeringRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^NetworksAddPeeringRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "Name of the peering, which should conform to RFC1035.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworksAddPeeringRequest this]
    (-> this (.getName))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^NetworksAddPeeringRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-network-peering
  "Network peering parameters. In order to specify route policies for peering using import/export
   custom routes, you will have to fill all peering related parameters (name, peer network,
   exchange_subnet_routes) in network_peeringfield. Corresponding fields in
   NetworksAddPeeringRequest will be deprecated soon.

  returns: `com.google.cloud.compute.v1.NetworkPeering`"
  (^com.google.cloud.compute.v1.NetworkPeering [^NetworksAddPeeringRequest this]
    (-> this (.getNetworkPeering))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NetworksAddPeeringRequest this]
    (-> this (.hashCode))))

(defn get-auto-create-routes?
  "This field will be deprecated soon. Prefer using exchange_subnet_routes in network_peering
   instead. Whether Google Compute Engine manages the routes automatically.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^NetworksAddPeeringRequest this]
    (-> this (.getAutoCreateRoutes))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NetworksAddPeeringRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.NetworksAddPeeringRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworksAddPeeringRequest$Builder [^NetworksAddPeeringRequest this]
    (-> this (.toBuilder))))

