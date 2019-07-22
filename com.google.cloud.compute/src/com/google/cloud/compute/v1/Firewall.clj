(ns com.google.cloud.compute.v1.Firewall
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Firewall]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.Firewall`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^com.google.cloud.compute.v1.Firewall prototype]
    (Firewall/newBuilder prototype))
  (^com.google.cloud.compute.v1.Firewall$Builder []
    (Firewall/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.Firewall`"
  (^com.google.cloud.compute.v1.Firewall []
    (Firewall/getDefaultInstance )))

(defn get-destination-ranges-list
  "If destination ranges are specified, the firewall will apply only to traffic that has
   destination IP address in these ranges. These ranges must be expressed in CIDR format. Only
   IPv4 is supported.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Firewall this]
    (-> this (.getDestinationRangesList))))

(defn get-denied-list
  "The list of DENY rules specified by this firewall. Each rule specifies a protocol and
   port-range tuple that describes a denied connection.

  returns: `java.util.List<com.google.cloud.compute.v1.Denied>`"
  (^java.util.List [^Firewall this]
    (-> this (.getDeniedList))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#firewall for firewall rules.

  returns: `java.lang.String`"
  (^java.lang.String [^Firewall this]
    (-> this (.getKind))))

(defn get-target-tags-list
  "A list of tags that controls which instances the firewall rule applies to. If targetTags are
   specified, then the firewall rule applies only to instances in the VPC network that have one of
   those tags. If no targetTags are specified, the firewall rule applies to all instances on the
   specified network.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Firewall this]
    (-> this (.getTargetTagsList))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Firewall this]
    (-> this (.getFieldMask))))

(defn get-source-service-accounts-list
  "If source service accounts are specified, the firewall will apply only to traffic originating
   from an instance with a service account in this list. Source service accounts cannot be used to
   control traffic to an instance's external IP address because service accounts are associated
   with an instance, not an IP address. sourceRanges can be set at the same time as
   sourceServiceAccounts. If both are set, the firewall will apply to traffic that has source IP
   address within sourceRanges OR the source IP belongs to an instance with service account listed
   in sourceServiceAccount. The connection does not need to match both properties for the firewall
   to apply. sourceServiceAccounts cannot be used at the same time as sourceTags or targetTags.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Firewall this]
    (-> this (.getSourceServiceAccountsList))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Firewall this]
    (-> this (.toString))))

(defn get-target-service-accounts-list
  "A list of service accounts indicating sets of instances located in the network that may make
   network connections as specified in allowed[]. targetServiceAccounts cannot be used at the same
   time as targetTags or sourceTags. If neither targetServiceAccounts nor targetTags are
   specified, the firewall rule applies to all instances on the specified network.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Firewall this]
    (-> this (.getTargetServiceAccountsList))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Firewall this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-direction
  "Direction of traffic to which this firewall applies; default is INGRESS. Note: For INGRESS
   traffic, it is NOT supported to specify destinationRanges; For EGRESS traffic, it is NOT
   supported to specify sourceRanges OR sourceTags.

  returns: `java.lang.String`"
  (^java.lang.String [^Firewall this]
    (-> this (.getDirection))))

(defn get-source-tags-list
  "If source tags are specified, the firewall rule applies only to traffic with source IPs that
   match the primary network interfaces of VM instances that have the tag and are in the same VPC
   network. Source tags cannot be used to control traffic to an instance's external IP address, it
   only applies to traffic between instances in the same virtual network. Because tags are
   associated with instances, not IP addresses. One or both of sourceRanges and sourceTags may be
   set. If both properties are set, the firewall will apply to traffic that has source IP address
   within sourceRanges OR the source IP that belongs to a tag listed in the sourceTags property.
   The connection does not need to match both properties for the firewall to apply.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Firewall this]
    (-> this (.getSourceTagsList))))

(defn get-name
  "Name of the resource; provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^Firewall this]
    (-> this (.getName))))

(defn get-source-ranges-list
  "If source ranges are specified, the firewall will apply only to traffic that has source IP
   address in these ranges. These ranges must be expressed in CIDR format. One or both of
   sourceRanges and sourceTags may be set. If both properties are set, the firewall will apply to
   traffic that has source IP address within sourceRanges OR the source IP that belongs to a tag
   listed in the sourceTags property. The connection does not need to match both properties for
   the firewall to apply. Only IPv4 is supported.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Firewall this]
    (-> this (.getSourceRangesList))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Firewall this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^Firewall this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^Firewall this]
    (-> this (.getApiMessageRequestBody))))

(defn get-disabled?
  "Denotes whether the firewall rule is disabled, i.e not applied to the network it is associated
   with. When set to true, the firewall rule is not enforced and the network behaves as if it did
   not exist. If this is unspecified, the firewall rule will be enabled.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^Firewall this]
    (-> this (.getDisabled))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Firewall this]
    (-> this (.getSelfLink))))

(defn get-network
  "URL of the network resource for this firewall rule. If not specified when creating a firewall
   rule, the default network is used: global/networks/default If you choose to specify this
   property, you can specify the network as a full or partial URL. For example, the following are
   all valid URLs: -
   https://www.googleapis.com/compute/v1/projects/myproject/global/networks/my-network -
   projects/myproject/global/networks/my-network - global/networks/default

  returns: `java.lang.String`"
  (^java.lang.String [^Firewall this]
    (-> this (.getNetwork))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Firewall this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Firewall this]
    (-> this (.getCreationTimestamp))))

(defn get-log-config
  "This field denotes the logging options for a particular firewall rule. If logging is enabled,
   logs will be exported to Stackdriver.

  returns: `com.google.cloud.compute.v1.FirewallLogConfig`"
  (^com.google.cloud.compute.v1.FirewallLogConfig [^Firewall this]
    (-> this (.getLogConfig))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Firewall this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-allowed-list
  "The list of ALLOW rules specified by this firewall. Each rule specifies a protocol and
   port-range tuple that describes a permitted connection.

  returns: `java.util.List<com.google.cloud.compute.v1.Allowed>`"
  (^java.util.List [^Firewall this]
    (-> this (.getAllowedList))))

(defn get-priority
  "Priority for this rule. This is an integer between 0 and 65535, both inclusive. When not
   specified, the value assumed is 1000. Relative priorities determine precedence of conflicting
   rules. Lower value of priority implies higher precedence (eg, a rule with priority 0 has higher
   precedence than a rule with priority 1). DENY rules take precedence over ALLOW rules having
   equal priority.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Firewall this]
    (-> this (.getPriority))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall this]
    (-> this (.toBuilder))))

