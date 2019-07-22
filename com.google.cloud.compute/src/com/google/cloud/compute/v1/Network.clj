(ns com.google.cloud.compute.v1.Network
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Network]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.Network`

  returns: `com.google.cloud.compute.v1.Network$Builder`"
  (^com.google.cloud.compute.v1.Network$Builder [^com.google.cloud.compute.v1.Network prototype]
    (Network/newBuilder prototype))
  (^com.google.cloud.compute.v1.Network$Builder []
    (Network/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.Network`"
  (^com.google.cloud.compute.v1.Network []
    (Network/getDefaultInstance )))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#network for networks.

  returns: `java.lang.String`"
  (^java.lang.String [^Network this]
    (-> this (.getKind))))

(defn get-routing-config
  "The network-level routing configuration for this network. Used by Cloud Router to determine
   what type of network-wide routing behavior to enforce.

  returns: `com.google.cloud.compute.v1.NetworkRoutingConfig`"
  (^com.google.cloud.compute.v1.NetworkRoutingConfig [^Network this]
    (-> this (.getRoutingConfig))))

(defn get-peerings-list
  "[Output Only] A list of network peerings for the resource.

  returns: `java.util.List<com.google.cloud.compute.v1.NetworkPeering>`"
  (^java.util.List [^Network this]
    (-> this (.getPeeringsList))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Network this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Network this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Network this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-gateway-i-pv-4
  "[Output Only] The gateway address for default routing out of the network. This value is read
   only and is selected by GCP.

  returns: `java.lang.String`"
  (^java.lang.String [^Network this]
    (-> this (.getGatewayIPv4))))

(defn get-subnetworks-list
  "[Output Only] Server-defined fully-qualified URLs for all subnetworks in this VPC network.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Network this]
    (-> this (.getSubnetworksList))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^Network this]
    (-> this (.getName))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Network this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^Network this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^Network this]
    (-> this (.getApiMessageRequestBody))))

(defn get-auto-create-subnetworks?
  "When set to true, the VPC network is created in \"auto\" mode. When set to false, the VPC network
   is created in \"custom\" mode.

   An auto mode VPC network starts with one subnet per region. Each subnet has a predetermined
   range as described in Auto mode VPC network IP ranges.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^Network this]
    (-> this (.getAutoCreateSubnetworks))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Network this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Network this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Network this]
    (-> this (.getCreationTimestamp))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Network this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-i-pv-4-range
  "Deprecated in favor of subnet mode networks. The range of internal addresses that are legal on
   this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by the
   client when the network is created.

  returns: `java.lang.String`"
  (^java.lang.String [^Network this]
    (-> this (.getIPv4Range))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.Network$Builder`"
  (^com.google.cloud.compute.v1.Network$Builder [^Network this]
    (-> this (.toBuilder))))

