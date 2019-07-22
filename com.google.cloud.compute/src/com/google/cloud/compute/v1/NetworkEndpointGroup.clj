(ns com.google.cloud.compute.v1.NetworkEndpointGroup
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworkEndpointGroup]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.NetworkEndpointGroup`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroup$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroup$Builder [^com.google.cloud.compute.v1.NetworkEndpointGroup prototype]
    (NetworkEndpointGroup/newBuilder prototype))
  (^com.google.cloud.compute.v1.NetworkEndpointGroup$Builder []
    (NetworkEndpointGroup/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.NetworkEndpointGroup`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroup []
    (NetworkEndpointGroup/getDefaultInstance )))

(defn get-default-port
  "The default port used if the port number is not specified in the network endpoint.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^NetworkEndpointGroup this]
    (-> this (.getDefaultPort))))

(defn get-subnetwork
  "Optional URL of the subnetwork to which all network endpoints in the NEG belong.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroup this]
    (-> this (.getSubnetwork))))

(defn get-network-endpoint-type
  "Type of network endpoints in this network endpoint group. Currently the only supported value is
   GCE_VM_IP_PORT.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroup this]
    (-> this (.getNetworkEndpointType))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#networkEndpointGroup for network endpoint
   group.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroup this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NetworkEndpointGroup this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroup this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^NetworkEndpointGroup this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "Name of the resource; provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroup this]
    (-> this (.getName))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroup this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroup this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^NetworkEndpointGroup this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroup this]
    (-> this (.getSelfLink))))

(defn get-zone
  "[Output Only] The URL of the zone where the network endpoint group is located.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroup this]
    (-> this (.getZone))))

(defn get-network
  "The URL of the network to which all network endpoints in the NEG belong. Uses \"default\" project
   network if unspecified.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroup this]
    (-> this (.getNetwork))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NetworkEndpointGroup this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroup this]
    (-> this (.getCreationTimestamp))))

(defn get-size
  "[Output only] Number of network endpoints in the network endpoint group.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^NetworkEndpointGroup this]
    (-> this (.getSize))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NetworkEndpointGroup this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.NetworkEndpointGroup$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroup$Builder [^NetworkEndpointGroup this]
    (-> this (.toBuilder))))

