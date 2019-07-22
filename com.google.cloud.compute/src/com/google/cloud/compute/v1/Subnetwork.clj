(ns com.google.cloud.compute.v1.Subnetwork
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Subnetwork]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.Subnetwork`

  returns: `com.google.cloud.compute.v1.Subnetwork$Builder`"
  (^com.google.cloud.compute.v1.Subnetwork$Builder [^com.google.cloud.compute.v1.Subnetwork prototype]
    (Subnetwork/newBuilder prototype))
  (^com.google.cloud.compute.v1.Subnetwork$Builder []
    (Subnetwork/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.Subnetwork`"
  (^com.google.cloud.compute.v1.Subnetwork []
    (Subnetwork/getDefaultInstance )))

(defn get-gateway-address
  "[Output Only] The gateway address for default routes to reach destination addresses outside
   this subnetwork.

  returns: `java.lang.String`"
  (^java.lang.String [^Subnetwork this]
    (-> this (.getGatewayAddress))))

(defn get-secondary-ip-ranges-list
  "An array of configurations for secondary IP ranges for VM instances contained in this
   subnetwork. The primary IP of such VM must belong to the primary ipCidrRange of the subnetwork.
   The alias IPs may belong to either primary or secondary ranges. This field can be updated with
   a patch request.

  returns: `java.util.List<com.google.cloud.compute.v1.SubnetworkSecondaryRange>`"
  (^java.util.List [^Subnetwork this]
    (-> this (.getSecondaryIpRangesList))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#subnetwork for Subnetwork resources.

  returns: `java.lang.String`"
  (^java.lang.String [^Subnetwork this]
    (-> this (.getKind))))

(defn get-fingerprint
  "Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   in optimistic locking. This field will be ignored when inserting a Subnetwork. An up-to-date
   fingerprint must be provided in order to update the Subnetwork, otherwise the request will fail
   with error 412 conditionNotMet.

   To see the latest fingerprint, make a get() request to retrieve a Subnetwork.

  returns: `java.lang.String`"
  (^java.lang.String [^Subnetwork this]
    (-> this (.getFingerprint))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Subnetwork this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Subnetwork this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Subnetwork this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "The name of the resource, provided by the client when initially creating the resource. The name
   must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
   characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means
   the first character must be a lowercase letter, and all following characters must be a dash,
   lowercase letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^Subnetwork this]
    (-> this (.getName))))

(defn get-ip-cidr-range
  "The range of internal addresses that are owned by this subnetwork. Provide this property when
   you create the subnetwork. For example, 10.0.0.0/8 or 192.168.0.0/16. Ranges must be unique and
   non-overlapping within a network. Only IPv4 is supported. This field can be set only at
   resource creation time.

  returns: `java.lang.String`"
  (^java.lang.String [^Subnetwork this]
    (-> this (.getIpCidrRange))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.
   This field can be set only at resource creation time.

  returns: `java.lang.String`"
  (^java.lang.String [^Subnetwork this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^Subnetwork this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^Subnetwork this]
    (-> this (.getApiMessageRequestBody))))

(defn get-private-ip-google-access?
  "Whether the VMs in this subnet can access Google services without assigned external IP
   addresses. This field can be both set at resource creation time and updated using
   setPrivateIpGoogleAccess.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^Subnetwork this]
    (-> this (.getPrivateIpGoogleAccess))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Subnetwork this]
    (-> this (.getSelfLink))))

(defn get-network
  "The URL of the network to which this subnetwork belongs, provided by the client when initially
   creating the subnetwork. Only networks that are in the distributed mode can have subnetworks.
   This field can be set only at resource creation time.

  returns: `java.lang.String`"
  (^java.lang.String [^Subnetwork this]
    (-> this (.getNetwork))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Subnetwork this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Subnetwork this]
    (-> this (.getCreationTimestamp))))

(defn get-enable-flow-logs?
  "Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it
   will not appear in get listings. If not set the default behavior is to disable flow logging.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^Subnetwork this]
    (-> this (.getEnableFlowLogs))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Subnetwork this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "URL of the region where the Subnetwork resides. This field can be set only at resource creation
   time.

  returns: `java.lang.String`"
  (^java.lang.String [^Subnetwork this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.Subnetwork$Builder`"
  (^com.google.cloud.compute.v1.Subnetwork$Builder [^Subnetwork this]
    (-> this (.toBuilder))))

