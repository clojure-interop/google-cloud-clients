(ns com.google.cloud.compute.v1.NetworksAddPeeringRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworksAddPeeringRequest$Builder]))

(defn get-peer-network
  "URL of the peer network. It can be either full URL or partial URL. The peer network may
   belong to a different project. If the partial URL does not contain project, it is assumed
   that the peer network is in the same project as the current network.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworksAddPeeringRequest$Builder this]
    (-> this (.getPeerNetwork))))

(defn set-auto-create-routes
  "This field will be deprecated soon. Prefer using exchange_subnet_routes in network_peering
   instead. Whether Google Compute Engine manages the routes automatically.

  auto-create-routes - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.NetworksAddPeeringRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworksAddPeeringRequest$Builder [^NetworksAddPeeringRequest$Builder this ^java.lang.Boolean auto-create-routes]
    (-> this (.setAutoCreateRoutes auto-create-routes))))

(defn set-name
  "Name of the peering, which should conform to RFC1035.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NetworksAddPeeringRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworksAddPeeringRequest$Builder [^NetworksAddPeeringRequest$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn get-name
  "Name of the peering, which should conform to RFC1035.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworksAddPeeringRequest$Builder this]
    (-> this (.getName))))

(defn build
  "returns: `com.google.cloud.compute.v1.NetworksAddPeeringRequest`"
  (^com.google.cloud.compute.v1.NetworksAddPeeringRequest [^NetworksAddPeeringRequest$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.NetworksAddPeeringRequest`

  returns: `com.google.cloud.compute.v1.NetworksAddPeeringRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworksAddPeeringRequest$Builder [^NetworksAddPeeringRequest$Builder this ^com.google.cloud.compute.v1.NetworksAddPeeringRequest other]
    (-> this (.mergeFrom other))))

(defn set-peer-network
  "URL of the peer network. It can be either full URL or partial URL. The peer network may
   belong to a different project. If the partial URL does not contain project, it is assumed
   that the peer network is in the same project as the current network.

  peer-network - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NetworksAddPeeringRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworksAddPeeringRequest$Builder [^NetworksAddPeeringRequest$Builder this ^java.lang.String peer-network]
    (-> this (.setPeerNetwork peer-network))))

(defn clone
  "returns: `com.google.cloud.compute.v1.NetworksAddPeeringRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworksAddPeeringRequest$Builder [^NetworksAddPeeringRequest$Builder this]
    (-> this (.clone))))

(defn get-network-peering
  "Network peering parameters. In order to specify route policies for peering using
   import/export custom routes, you will have to fill all peering related parameters (name, peer
   network, exchange_subnet_routes) in network_peeringfield. Corresponding fields in
   NetworksAddPeeringRequest will be deprecated soon.

  returns: `com.google.cloud.compute.v1.NetworkPeering`"
  (^com.google.cloud.compute.v1.NetworkPeering [^NetworksAddPeeringRequest$Builder this]
    (-> this (.getNetworkPeering))))

(defn get-auto-create-routes?
  "This field will be deprecated soon. Prefer using exchange_subnet_routes in network_peering
   instead. Whether Google Compute Engine manages the routes automatically.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^NetworksAddPeeringRequest$Builder this]
    (-> this (.getAutoCreateRoutes))))

(defn set-network-peering
  "Network peering parameters. In order to specify route policies for peering using
   import/export custom routes, you will have to fill all peering related parameters (name, peer
   network, exchange_subnet_routes) in network_peeringfield. Corresponding fields in
   NetworksAddPeeringRequest will be deprecated soon.

  network-peering - `com.google.cloud.compute.v1.NetworkPeering`

  returns: `com.google.cloud.compute.v1.NetworksAddPeeringRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworksAddPeeringRequest$Builder [^NetworksAddPeeringRequest$Builder this ^com.google.cloud.compute.v1.NetworkPeering network-peering]
    (-> this (.setNetworkPeering network-peering))))

