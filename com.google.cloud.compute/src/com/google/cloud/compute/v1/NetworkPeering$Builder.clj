(ns com.google.cloud.compute.v1.NetworkPeering$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworkPeering$Builder]))

(defn set-auto-create-routes
  "This field will be deprecated soon. Prefer using exchange_subnet_routes instead. Indicates
   whether full mesh connectivity is created and managed automatically. When it is set to true,
   Google Compute Engine will automatically create and manage the routes between two networks
   when the state is ACTIVE. Otherwise, user needs to create routes manually to route packets to
   peer network.

  auto-create-routes - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.NetworkPeering$Builder`"
  (^com.google.cloud.compute.v1.NetworkPeering$Builder [^NetworkPeering$Builder this ^java.lang.Boolean auto-create-routes]
    (-> this (.setAutoCreateRoutes auto-create-routes))))

(defn set-network
  "The URL of the peer network. It can be either full URL or partial URL. The peer network may
   belong to a different project. If the partial URL does not contain project, it is assumed
   that the peer network is in the same project as the current network.

  network - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NetworkPeering$Builder`"
  (^com.google.cloud.compute.v1.NetworkPeering$Builder [^NetworkPeering$Builder this ^java.lang.String network]
    (-> this (.setNetwork network))))

(defn set-name
  "Name of this peering. Provided by the client when the peering is created. The name must
   comply with RFC1035. Specifically, the name must be 1-63 characters long and match regular
   expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a
   lowercase letter, and all the following characters must be a dash, lowercase letter, or
   digit, except the last character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NetworkPeering$Builder`"
  (^com.google.cloud.compute.v1.NetworkPeering$Builder [^NetworkPeering$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn get-exchange-subnet-routes?
  "Whether full mesh connectivity is created and managed automatically. When it is set to true,
   Google Compute Engine will automatically create and manage the routes between two networks
   when the peering state is ACTIVE. Otherwise, user needs to create routes manually to route
   packets to peer network.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^NetworkPeering$Builder this]
    (-> this (.getExchangeSubnetRoutes))))

(defn set-state
  "[Output Only] State for the peering.

  state - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NetworkPeering$Builder`"
  (^com.google.cloud.compute.v1.NetworkPeering$Builder [^NetworkPeering$Builder this ^java.lang.String state]
    (-> this (.setState state))))

(defn get-name
  "Name of this peering. Provided by the client when the peering is created. The name must
   comply with RFC1035. Specifically, the name must be 1-63 characters long and match regular
   expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a
   lowercase letter, and all the following characters must be a dash, lowercase letter, or
   digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkPeering$Builder this]
    (-> this (.getName))))

(defn get-state
  "[Output Only] State for the peering.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkPeering$Builder this]
    (-> this (.getState))))

(defn set-exchange-subnet-routes
  "Whether full mesh connectivity is created and managed automatically. When it is set to true,
   Google Compute Engine will automatically create and manage the routes between two networks
   when the peering state is ACTIVE. Otherwise, user needs to create routes manually to route
   packets to peer network.

  exchange-subnet-routes - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.NetworkPeering$Builder`"
  (^com.google.cloud.compute.v1.NetworkPeering$Builder [^NetworkPeering$Builder this ^java.lang.Boolean exchange-subnet-routes]
    (-> this (.setExchangeSubnetRoutes exchange-subnet-routes))))

(defn build
  "returns: `com.google.cloud.compute.v1.NetworkPeering`"
  (^com.google.cloud.compute.v1.NetworkPeering [^NetworkPeering$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.NetworkPeering`

  returns: `com.google.cloud.compute.v1.NetworkPeering$Builder`"
  (^com.google.cloud.compute.v1.NetworkPeering$Builder [^NetworkPeering$Builder this ^com.google.cloud.compute.v1.NetworkPeering other]
    (-> this (.mergeFrom other))))

(defn get-state-details
  "[Output Only] Details about the current state of the peering.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkPeering$Builder this]
    (-> this (.getStateDetails))))

(defn get-network
  "The URL of the peer network. It can be either full URL or partial URL. The peer network may
   belong to a different project. If the partial URL does not contain project, it is assumed
   that the peer network is in the same project as the current network.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkPeering$Builder this]
    (-> this (.getNetwork))))

(defn clone
  "returns: `com.google.cloud.compute.v1.NetworkPeering$Builder`"
  (^com.google.cloud.compute.v1.NetworkPeering$Builder [^NetworkPeering$Builder this]
    (-> this (.clone))))

(defn get-auto-create-routes?
  "This field will be deprecated soon. Prefer using exchange_subnet_routes instead. Indicates
   whether full mesh connectivity is created and managed automatically. When it is set to true,
   Google Compute Engine will automatically create and manage the routes between two networks
   when the state is ACTIVE. Otherwise, user needs to create routes manually to route packets to
   peer network.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^NetworkPeering$Builder this]
    (-> this (.getAutoCreateRoutes))))

(defn set-state-details
  "[Output Only] Details about the current state of the peering.

  state-details - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NetworkPeering$Builder`"
  (^com.google.cloud.compute.v1.NetworkPeering$Builder [^NetworkPeering$Builder this ^java.lang.String state-details]
    (-> this (.setStateDetails state-details))))

