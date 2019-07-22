(ns com.google.cloud.compute.v1.Subnetwork$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Subnetwork$Builder]))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.
   This field can be set only at resource creation time.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Subnetwork$Builder`"
  (^com.google.cloud.compute.v1.Subnetwork$Builder [^Subnetwork$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn get-gateway-address
  "[Output Only] The gateway address for default routes to reach destination addresses outside
   this subnetwork.

  returns: `java.lang.String`"
  (^java.lang.String [^Subnetwork$Builder this]
    (-> this (.getGatewayAddress))))

(defn set-region
  "URL of the region where the Subnetwork resides. This field can be set only at resource
   creation time.

  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Subnetwork$Builder`"
  (^com.google.cloud.compute.v1.Subnetwork$Builder [^Subnetwork$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Subnetwork$Builder`"
  (^com.google.cloud.compute.v1.Subnetwork$Builder [^Subnetwork$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn get-secondary-ip-ranges-list
  "An array of configurations for secondary IP ranges for VM instances contained in this
   subnetwork. The primary IP of such VM must belong to the primary ipCidrRange of the
   subnetwork. The alias IPs may belong to either primary or secondary ranges. This field can be
   updated with a patch request.

  returns: `java.util.List<com.google.cloud.compute.v1.SubnetworkSecondaryRange>`"
  (^java.util.List [^Subnetwork$Builder this]
    (-> this (.getSecondaryIpRangesList))))

(defn set-enable-flow-logs
  "Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it
   will not appear in get listings. If not set the default behavior is to disable flow logging.

  enable-flow-logs - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.Subnetwork$Builder`"
  (^com.google.cloud.compute.v1.Subnetwork$Builder [^Subnetwork$Builder this ^java.lang.Boolean enable-flow-logs]
    (-> this (.setEnableFlowLogs enable-flow-logs))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#subnetwork for Subnetwork resources.

  returns: `java.lang.String`"
  (^java.lang.String [^Subnetwork$Builder this]
    (-> this (.getKind))))

(defn set-fingerprint
  "Fingerprint of this resource. A hash of the contents stored in this object. This field is
   used in optimistic locking. This field will be ignored when inserting a Subnetwork. An
   up-to-date fingerprint must be provided in order to update the Subnetwork, otherwise the
   request will fail with error 412 conditionNotMet.

   To see the latest fingerprint, make a get() request to retrieve a Subnetwork.

  fingerprint - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Subnetwork$Builder`"
  (^com.google.cloud.compute.v1.Subnetwork$Builder [^Subnetwork$Builder this ^java.lang.String fingerprint]
    (-> this (.setFingerprint fingerprint))))

(defn set-network
  "The URL of the network to which this subnetwork belongs, provided by the client when
   initially creating the subnetwork. Only networks that are in the distributed mode can have
   subnetworks. This field can be set only at resource creation time.

  network - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Subnetwork$Builder`"
  (^com.google.cloud.compute.v1.Subnetwork$Builder [^Subnetwork$Builder this ^java.lang.String network]
    (-> this (.setNetwork network))))

(defn get-fingerprint
  "Fingerprint of this resource. A hash of the contents stored in this object. This field is
   used in optimistic locking. This field will be ignored when inserting a Subnetwork. An
   up-to-date fingerprint must be provided in order to update the Subnetwork, otherwise the
   request will fail with error 412 conditionNotMet.

   To see the latest fingerprint, make a get() request to retrieve a Subnetwork.

  returns: `java.lang.String`"
  (^java.lang.String [^Subnetwork$Builder this]
    (-> this (.getFingerprint))))

(defn set-gateway-address
  "[Output Only] The gateway address for default routes to reach destination addresses outside
   this subnetwork.

  gateway-address - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Subnetwork$Builder`"
  (^com.google.cloud.compute.v1.Subnetwork$Builder [^Subnetwork$Builder this ^java.lang.String gateway-address]
    (-> this (.setGatewayAddress gateway-address))))

(defn set-name
  "The name of the resource, provided by the client when initially creating the resource. The
   name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be
   1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which
   means the first character must be a lowercase letter, and all following characters must be a
   dash, lowercase letter, or digit, except the last character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Subnetwork$Builder`"
  (^com.google.cloud.compute.v1.Subnetwork$Builder [^Subnetwork$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-kind
  "[Output Only] Type of the resource. Always compute#subnetwork for Subnetwork resources.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Subnetwork$Builder`"
  (^com.google.cloud.compute.v1.Subnetwork$Builder [^Subnetwork$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-name
  "The name of the resource, provided by the client when initially creating the resource. The
   name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be
   1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which
   means the first character must be a lowercase letter, and all following characters must be a
   dash, lowercase letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^Subnetwork$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Subnetwork$Builder`"
  (^com.google.cloud.compute.v1.Subnetwork$Builder [^Subnetwork$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn get-ip-cidr-range
  "The range of internal addresses that are owned by this subnetwork. Provide this property when
   you create the subnetwork. For example, 10.0.0.0/8 or 192.168.0.0/16. Ranges must be unique
   and non-overlapping within a network. Only IPv4 is supported. This field can be set only at
   resource creation time.

  returns: `java.lang.String`"
  (^java.lang.String [^Subnetwork$Builder this]
    (-> this (.getIpCidrRange))))

(defn build
  "returns: `com.google.cloud.compute.v1.Subnetwork`"
  (^com.google.cloud.compute.v1.Subnetwork [^Subnetwork$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.
   This field can be set only at resource creation time.

  returns: `java.lang.String`"
  (^java.lang.String [^Subnetwork$Builder this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^Subnetwork$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Subnetwork$Builder`"
  (^com.google.cloud.compute.v1.Subnetwork$Builder [^Subnetwork$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Subnetwork`

  returns: `com.google.cloud.compute.v1.Subnetwork$Builder`"
  (^com.google.cloud.compute.v1.Subnetwork$Builder [^Subnetwork$Builder this ^com.google.cloud.compute.v1.Subnetwork other]
    (-> this (.mergeFrom other))))

(defn get-private-ip-google-access?
  "Whether the VMs in this subnet can access Google services without assigned external IP
   addresses. This field can be both set at resource creation time and updated using
   setPrivateIpGoogleAccess.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^Subnetwork$Builder this]
    (-> this (.getPrivateIpGoogleAccess))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Subnetwork$Builder this]
    (-> this (.getSelfLink))))

(defn add-secondary-ip-ranges
  "An array of configurations for secondary IP ranges for VM instances contained in this
   subnetwork. The primary IP of such VM must belong to the primary ipCidrRange of the
   subnetwork. The alias IPs may belong to either primary or secondary ranges. This field can be
   updated with a patch request.

  secondary-ip-ranges - `com.google.cloud.compute.v1.SubnetworkSecondaryRange`

  returns: `com.google.cloud.compute.v1.Subnetwork$Builder`"
  (^com.google.cloud.compute.v1.Subnetwork$Builder [^Subnetwork$Builder this ^com.google.cloud.compute.v1.SubnetworkSecondaryRange secondary-ip-ranges]
    (-> this (.addSecondaryIpRanges secondary-ip-ranges))))

(defn set-ip-cidr-range
  "The range of internal addresses that are owned by this subnetwork. Provide this property when
   you create the subnetwork. For example, 10.0.0.0/8 or 192.168.0.0/16. Ranges must be unique
   and non-overlapping within a network. Only IPv4 is supported. This field can be set only at
   resource creation time.

  ip-cidr-range - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Subnetwork$Builder`"
  (^com.google.cloud.compute.v1.Subnetwork$Builder [^Subnetwork$Builder this ^java.lang.String ip-cidr-range]
    (-> this (.setIpCidrRange ip-cidr-range))))

(defn get-network
  "The URL of the network to which this subnetwork belongs, provided by the client when
   initially creating the subnetwork. Only networks that are in the distributed mode can have
   subnetworks. This field can be set only at resource creation time.

  returns: `java.lang.String`"
  (^java.lang.String [^Subnetwork$Builder this]
    (-> this (.getNetwork))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Subnetwork$Builder`"
  (^com.google.cloud.compute.v1.Subnetwork$Builder [^Subnetwork$Builder this]
    (-> this (.clone))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Subnetwork$Builder this]
    (-> this (.getCreationTimestamp))))

(defn set-private-ip-google-access
  "Whether the VMs in this subnet can access Google services without assigned external IP
   addresses. This field can be both set at resource creation time and updated using
   setPrivateIpGoogleAccess.

  private-ip-google-access - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.Subnetwork$Builder`"
  (^com.google.cloud.compute.v1.Subnetwork$Builder [^Subnetwork$Builder this ^java.lang.Boolean private-ip-google-access]
    (-> this (.setPrivateIpGoogleAccess private-ip-google-access))))

(defn get-enable-flow-logs?
  "Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it
   will not appear in get listings. If not set the default behavior is to disable flow logging.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^Subnetwork$Builder this]
    (-> this (.getEnableFlowLogs))))

(defn add-all-secondary-ip-ranges
  "An array of configurations for secondary IP ranges for VM instances contained in this
   subnetwork. The primary IP of such VM must belong to the primary ipCidrRange of the
   subnetwork. The alias IPs may belong to either primary or secondary ranges. This field can be
   updated with a patch request.

  secondary-ip-ranges - `java.util.List`

  returns: `com.google.cloud.compute.v1.Subnetwork$Builder`"
  (^com.google.cloud.compute.v1.Subnetwork$Builder [^Subnetwork$Builder this ^java.util.List secondary-ip-ranges]
    (-> this (.addAllSecondaryIpRanges secondary-ip-ranges))))

(defn get-region
  "URL of the region where the Subnetwork resides. This field can be set only at resource
   creation time.

  returns: `java.lang.String`"
  (^java.lang.String [^Subnetwork$Builder this]
    (-> this (.getRegion))))

