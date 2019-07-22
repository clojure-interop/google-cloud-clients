(ns com.google.cloud.compute.v1.NetworkPeering
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworkPeering]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.NetworkPeering`

  returns: `com.google.cloud.compute.v1.NetworkPeering$Builder`"
  (^com.google.cloud.compute.v1.NetworkPeering$Builder [^com.google.cloud.compute.v1.NetworkPeering prototype]
    (NetworkPeering/newBuilder prototype))
  (^com.google.cloud.compute.v1.NetworkPeering$Builder []
    (NetworkPeering/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.NetworkPeering`"
  (^com.google.cloud.compute.v1.NetworkPeering []
    (NetworkPeering/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NetworkPeering this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NetworkPeering this]
    (-> this (.toString))))

(defn get-exchange-subnet-routes?
  "Whether full mesh connectivity is created and managed automatically. When it is set to true,
   Google Compute Engine will automatically create and manage the routes between two networks when
   the peering state is ACTIVE. Otherwise, user needs to create routes manually to route packets
   to peer network.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^NetworkPeering this]
    (-> this (.getExchangeSubnetRoutes))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^NetworkPeering this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "Name of this peering. Provided by the client when the peering is created. The name must comply
   with RFC1035. Specifically, the name must be 1-63 characters long and match regular expression
   `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter,
   and all the following characters must be a dash, lowercase letter, or digit, except the last
   character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkPeering this]
    (-> this (.getName))))

(defn get-state
  "[Output Only] State for the peering.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkPeering this]
    (-> this (.getState))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^NetworkPeering this]
    (-> this (.getApiMessageRequestBody))))

(defn get-state-details
  "[Output Only] Details about the current state of the peering.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkPeering this]
    (-> this (.getStateDetails))))

(defn get-network
  "The URL of the peer network. It can be either full URL or partial URL. The peer network may
   belong to a different project. If the partial URL does not contain project, it is assumed that
   the peer network is in the same project as the current network.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkPeering this]
    (-> this (.getNetwork))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NetworkPeering this]
    (-> this (.hashCode))))

(defn get-auto-create-routes?
  "This field will be deprecated soon. Prefer using exchange_subnet_routes instead. Indicates
   whether full mesh connectivity is created and managed automatically. When it is set to true,
   Google Compute Engine will automatically create and manage the routes between two networks when
   the state is ACTIVE. Otherwise, user needs to create routes manually to route packets to peer
   network.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^NetworkPeering this]
    (-> this (.getAutoCreateRoutes))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NetworkPeering this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.NetworkPeering$Builder`"
  (^com.google.cloud.compute.v1.NetworkPeering$Builder [^NetworkPeering this]
    (-> this (.toBuilder))))

