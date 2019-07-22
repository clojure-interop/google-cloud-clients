(ns com.google.cloud.compute.v1.NetworkEndpointGroup$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworkEndpointGroup$Builder]))

(defn get-default-port
  "The default port used if the port number is not specified in the network endpoint.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^NetworkEndpointGroup$Builder this]
    (-> this (.getDefaultPort))))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroup$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroup$Builder [^NetworkEndpointGroup$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn get-subnetwork
  "Optional URL of the subnetwork to which all network endpoints in the NEG belong.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroup$Builder this]
    (-> this (.getSubnetwork))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroup$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroup$Builder [^NetworkEndpointGroup$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn get-network-endpoint-type
  "Type of network endpoints in this network endpoint group. Currently the only supported value
   is GCE_VM_IP_PORT.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroup$Builder this]
    (-> this (.getNetworkEndpointType))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#networkEndpointGroup for network endpoint
   group.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroup$Builder this]
    (-> this (.getKind))))

(defn set-network-endpoint-type
  "Type of network endpoints in this network endpoint group. Currently the only supported value
   is GCE_VM_IP_PORT.

  network-endpoint-type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroup$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroup$Builder [^NetworkEndpointGroup$Builder this ^java.lang.String network-endpoint-type]
    (-> this (.setNetworkEndpointType network-endpoint-type))))

(defn set-network
  "The URL of the network to which all network endpoints in the NEG belong. Uses \"default\"
   project network if unspecified.

  network - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroup$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroup$Builder [^NetworkEndpointGroup$Builder this ^java.lang.String network]
    (-> this (.setNetwork network))))

(defn set-name
  "Name of the resource; provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroup$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroup$Builder [^NetworkEndpointGroup$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-kind
  "[Output Only] Type of the resource. Always compute#networkEndpointGroup for network endpoint
   group.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroup$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroup$Builder [^NetworkEndpointGroup$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-name
  "Name of the resource; provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroup$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroup$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroup$Builder [^NetworkEndpointGroup$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn build
  "returns: `com.google.cloud.compute.v1.NetworkEndpointGroup`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroup [^NetworkEndpointGroup$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroup$Builder this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroup$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroup$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroup$Builder [^NetworkEndpointGroup$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.NetworkEndpointGroup`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroup$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroup$Builder [^NetworkEndpointGroup$Builder this ^com.google.cloud.compute.v1.NetworkEndpointGroup other]
    (-> this (.mergeFrom other))))

(defn set-zone
  "[Output Only] The URL of the zone where the network endpoint group is located.

  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroup$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroup$Builder [^NetworkEndpointGroup$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroup$Builder this]
    (-> this (.getSelfLink))))

(defn get-zone
  "[Output Only] The URL of the zone where the network endpoint group is located.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroup$Builder this]
    (-> this (.getZone))))

(defn set-size
  "[Output only] Number of network endpoints in the network endpoint group.

  size - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroup$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroup$Builder [^NetworkEndpointGroup$Builder this ^java.lang.Integer size]
    (-> this (.setSize size))))

(defn get-network
  "The URL of the network to which all network endpoints in the NEG belong. Uses \"default\"
   project network if unspecified.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroup$Builder this]
    (-> this (.getNetwork))))

(defn clone
  "returns: `com.google.cloud.compute.v1.NetworkEndpointGroup$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroup$Builder [^NetworkEndpointGroup$Builder this]
    (-> this (.clone))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroup$Builder this]
    (-> this (.getCreationTimestamp))))

(defn set-default-port
  "The default port used if the port number is not specified in the network endpoint.

  default-port - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroup$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroup$Builder [^NetworkEndpointGroup$Builder this ^java.lang.Integer default-port]
    (-> this (.setDefaultPort default-port))))

(defn get-size
  "[Output only] Number of network endpoints in the network endpoint group.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^NetworkEndpointGroup$Builder this]
    (-> this (.getSize))))

(defn set-subnetwork
  "Optional URL of the subnetwork to which all network endpoints in the NEG belong.

  subnetwork - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroup$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroup$Builder [^NetworkEndpointGroup$Builder this ^java.lang.String subnetwork]
    (-> this (.setSubnetwork subnetwork))))

