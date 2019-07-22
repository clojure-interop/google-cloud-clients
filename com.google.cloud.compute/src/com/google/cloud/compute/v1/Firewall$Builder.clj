(ns com.google.cloud.compute.v1.Firewall$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Firewall$Builder]))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn add-all-target-service-accounts
  "A list of service accounts indicating sets of instances located in the network that may make
   network connections as specified in allowed[]. targetServiceAccounts cannot be used at the
   same time as targetTags or sourceTags. If neither targetServiceAccounts nor targetTags are
   specified, the firewall rule applies to all instances on the specified network.

  target-service-accounts - `java.util.List`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this ^java.util.List target-service-accounts]
    (-> this (.addAllTargetServiceAccounts target-service-accounts))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn get-destination-ranges-list
  "If destination ranges are specified, the firewall will apply only to traffic that has
   destination IP address in these ranges. These ranges must be expressed in CIDR format. Only
   IPv4 is supported.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Firewall$Builder this]
    (-> this (.getDestinationRangesList))))

(defn add-all-target-tags
  "A list of tags that controls which instances the firewall rule applies to. If targetTags are
   specified, then the firewall rule applies only to instances in the VPC network that have one
   of those tags. If no targetTags are specified, the firewall rule applies to all instances on
   the specified network.

  target-tags - `java.util.List`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this ^java.util.List target-tags]
    (-> this (.addAllTargetTags target-tags))))

(defn add-all-source-service-accounts
  "If source service accounts are specified, the firewall will apply only to traffic originating
   from an instance with a service account in this list. Source service accounts cannot be used
   to control traffic to an instance's external IP address because service accounts are
   associated with an instance, not an IP address. sourceRanges can be set at the same time as
   sourceServiceAccounts. If both are set, the firewall will apply to traffic that has source IP
   address within sourceRanges OR the source IP belongs to an instance with service account
   listed in sourceServiceAccount. The connection does not need to match both properties for the
   firewall to apply. sourceServiceAccounts cannot be used at the same time as sourceTags or
   targetTags.

  source-service-accounts - `java.util.List`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this ^java.util.List source-service-accounts]
    (-> this (.addAllSourceServiceAccounts source-service-accounts))))

(defn get-denied-list
  "The list of DENY rules specified by this firewall. Each rule specifies a protocol and
   port-range tuple that describes a denied connection.

  returns: `java.util.List<com.google.cloud.compute.v1.Denied>`"
  (^java.util.List [^Firewall$Builder this]
    (-> this (.getDeniedList))))

(defn set-direction
  "Direction of traffic to which this firewall applies; default is INGRESS. Note: For INGRESS
   traffic, it is NOT supported to specify destinationRanges; For EGRESS traffic, it is NOT
   supported to specify sourceRanges OR sourceTags.

  direction - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this ^java.lang.String direction]
    (-> this (.setDirection direction))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#firewall for firewall rules.

  returns: `java.lang.String`"
  (^java.lang.String [^Firewall$Builder this]
    (-> this (.getKind))))

(defn add-target-service-accounts
  "A list of service accounts indicating sets of instances located in the network that may make
   network connections as specified in allowed[]. targetServiceAccounts cannot be used at the
   same time as targetTags or sourceTags. If neither targetServiceAccounts nor targetTags are
   specified, the firewall rule applies to all instances on the specified network.

  target-service-accounts - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this ^java.lang.String target-service-accounts]
    (-> this (.addTargetServiceAccounts target-service-accounts))))

(defn add-all-destination-ranges
  "If destination ranges are specified, the firewall will apply only to traffic that has
   destination IP address in these ranges. These ranges must be expressed in CIDR format. Only
   IPv4 is supported.

  destination-ranges - `java.util.List`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this ^java.util.List destination-ranges]
    (-> this (.addAllDestinationRanges destination-ranges))))

(defn add-all-source-ranges
  "If source ranges are specified, the firewall will apply only to traffic that has source IP
   address in these ranges. These ranges must be expressed in CIDR format. One or both of
   sourceRanges and sourceTags may be set. If both properties are set, the firewall will apply
   to traffic that has source IP address within sourceRanges OR the source IP that belongs to a
   tag listed in the sourceTags property. The connection does not need to match both properties
   for the firewall to apply. Only IPv4 is supported.

  source-ranges - `java.util.List`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this ^java.util.List source-ranges]
    (-> this (.addAllSourceRanges source-ranges))))

(defn get-target-tags-list
  "A list of tags that controls which instances the firewall rule applies to. If targetTags are
   specified, then the firewall rule applies only to instances in the VPC network that have one
   of those tags. If no targetTags are specified, the firewall rule applies to all instances on
   the specified network.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Firewall$Builder this]
    (-> this (.getTargetTagsList))))

(defn add-denied
  "The list of DENY rules specified by this firewall. Each rule specifies a protocol and
   port-range tuple that describes a denied connection.

  denied - `com.google.cloud.compute.v1.Denied`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this ^com.google.cloud.compute.v1.Denied denied]
    (-> this (.addDenied denied))))

(defn set-network
  "URL of the network resource for this firewall rule. If not specified when creating a firewall
   rule, the default network is used: global/networks/default If you choose to specify this
   property, you can specify the network as a full or partial URL. For example, the following
   are all valid URLs: -
   https://www.googleapis.com/compute/v1/projects/myproject/global/networks/my-network -
   projects/myproject/global/networks/my-network - global/networks/default

  network - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this ^java.lang.String network]
    (-> this (.setNetwork network))))

(defn add-source-service-accounts
  "If source service accounts are specified, the firewall will apply only to traffic originating
   from an instance with a service account in this list. Source service accounts cannot be used
   to control traffic to an instance's external IP address because service accounts are
   associated with an instance, not an IP address. sourceRanges can be set at the same time as
   sourceServiceAccounts. If both are set, the firewall will apply to traffic that has source IP
   address within sourceRanges OR the source IP belongs to an instance with service account
   listed in sourceServiceAccount. The connection does not need to match both properties for the
   firewall to apply. sourceServiceAccounts cannot be used at the same time as sourceTags or
   targetTags.

  source-service-accounts - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this ^java.lang.String source-service-accounts]
    (-> this (.addSourceServiceAccounts source-service-accounts))))

(defn set-name
  "Name of the resource; provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn add-all-source-tags
  "If source tags are specified, the firewall rule applies only to traffic with source IPs that
   match the primary network interfaces of VM instances that have the tag and are in the same
   VPC network. Source tags cannot be used to control traffic to an instance's external IP
   address, it only applies to traffic between instances in the same virtual network. Because
   tags are associated with instances, not IP addresses. One or both of sourceRanges and
   sourceTags may be set. If both properties are set, the firewall will apply to traffic that
   has source IP address within sourceRanges OR the source IP that belongs to a tag listed in
   the sourceTags property. The connection does not need to match both properties for the
   firewall to apply.

  source-tags - `java.util.List`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this ^java.util.List source-tags]
    (-> this (.addAllSourceTags source-tags))))

(defn get-source-service-accounts-list
  "If source service accounts are specified, the firewall will apply only to traffic originating
   from an instance with a service account in this list. Source service accounts cannot be used
   to control traffic to an instance's external IP address because service accounts are
   associated with an instance, not an IP address. sourceRanges can be set at the same time as
   sourceServiceAccounts. If both are set, the firewall will apply to traffic that has source IP
   address within sourceRanges OR the source IP belongs to an instance with service account
   listed in sourceServiceAccount. The connection does not need to match both properties for the
   firewall to apply. sourceServiceAccounts cannot be used at the same time as sourceTags or
   targetTags.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Firewall$Builder this]
    (-> this (.getSourceServiceAccountsList))))

(defn set-kind
  "[Output Only] Type of the resource. Always compute#firewall for firewall rules.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-target-service-accounts-list
  "A list of service accounts indicating sets of instances located in the network that may make
   network connections as specified in allowed[]. targetServiceAccounts cannot be used at the
   same time as targetTags or sourceTags. If neither targetServiceAccounts nor targetTags are
   specified, the firewall rule applies to all instances on the specified network.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Firewall$Builder this]
    (-> this (.getTargetServiceAccountsList))))

(defn get-direction
  "Direction of traffic to which this firewall applies; default is INGRESS. Note: For INGRESS
   traffic, it is NOT supported to specify destinationRanges; For EGRESS traffic, it is NOT
   supported to specify sourceRanges OR sourceTags.

  returns: `java.lang.String`"
  (^java.lang.String [^Firewall$Builder this]
    (-> this (.getDirection))))

(defn add-source-ranges
  "If source ranges are specified, the firewall will apply only to traffic that has source IP
   address in these ranges. These ranges must be expressed in CIDR format. One or both of
   sourceRanges and sourceTags may be set. If both properties are set, the firewall will apply
   to traffic that has source IP address within sourceRanges OR the source IP that belongs to a
   tag listed in the sourceTags property. The connection does not need to match both properties
   for the firewall to apply. Only IPv4 is supported.

  source-ranges - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this ^java.lang.String source-ranges]
    (-> this (.addSourceRanges source-ranges))))

(defn get-source-tags-list
  "If source tags are specified, the firewall rule applies only to traffic with source IPs that
   match the primary network interfaces of VM instances that have the tag and are in the same
   VPC network. Source tags cannot be used to control traffic to an instance's external IP
   address, it only applies to traffic between instances in the same virtual network. Because
   tags are associated with instances, not IP addresses. One or both of sourceRanges and
   sourceTags may be set. If both properties are set, the firewall will apply to traffic that
   has source IP address within sourceRanges OR the source IP that belongs to a tag listed in
   the sourceTags property. The connection does not need to match both properties for the
   firewall to apply.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Firewall$Builder this]
    (-> this (.getSourceTagsList))))

(defn get-name
  "Name of the resource; provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^Firewall$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn add-target-tags
  "A list of tags that controls which instances the firewall rule applies to. If targetTags are
   specified, then the firewall rule applies only to instances in the VPC network that have one
   of those tags. If no targetTags are specified, the firewall rule applies to all instances on
   the specified network.

  target-tags - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this ^java.lang.String target-tags]
    (-> this (.addTargetTags target-tags))))

(defn get-source-ranges-list
  "If source ranges are specified, the firewall will apply only to traffic that has source IP
   address in these ranges. These ranges must be expressed in CIDR format. One or both of
   sourceRanges and sourceTags may be set. If both properties are set, the firewall will apply
   to traffic that has source IP address within sourceRanges OR the source IP that belongs to a
   tag listed in the sourceTags property. The connection does not need to match both properties
   for the firewall to apply. Only IPv4 is supported.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Firewall$Builder this]
    (-> this (.getSourceRangesList))))

(defn build
  "returns: `com.google.cloud.compute.v1.Firewall`"
  (^com.google.cloud.compute.v1.Firewall [^Firewall$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Firewall$Builder this]
    (-> this (.getDescription))))

(defn set-priority
  "Priority for this rule. This is an integer between 0 and 65535, both inclusive. When not
   specified, the value assumed is 1000. Relative priorities determine precedence of conflicting
   rules. Lower value of priority implies higher precedence (eg, a rule with priority 0 has
   higher precedence than a rule with priority 1). DENY rules take precedence over ALLOW rules
   having equal priority.

  priority - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this ^java.lang.Integer priority]
    (-> this (.setPriority priority))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^Firewall$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Firewall`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this ^com.google.cloud.compute.v1.Firewall other]
    (-> this (.mergeFrom other))))

(defn get-disabled?
  "Denotes whether the firewall rule is disabled, i.e not applied to the network it is
   associated with. When set to true, the firewall rule is not enforced and the network behaves
   as if it did not exist. If this is unspecified, the firewall rule will be enabled.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^Firewall$Builder this]
    (-> this (.getDisabled))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Firewall$Builder this]
    (-> this (.getSelfLink))))

(defn add-allowed
  "The list of ALLOW rules specified by this firewall. Each rule specifies a protocol and
   port-range tuple that describes a permitted connection.

  allowed - `com.google.cloud.compute.v1.Allowed`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this ^com.google.cloud.compute.v1.Allowed allowed]
    (-> this (.addAllowed allowed))))

(defn get-network
  "URL of the network resource for this firewall rule. If not specified when creating a firewall
   rule, the default network is used: global/networks/default If you choose to specify this
   property, you can specify the network as a full or partial URL. For example, the following
   are all valid URLs: -
   https://www.googleapis.com/compute/v1/projects/myproject/global/networks/my-network -
   projects/myproject/global/networks/my-network - global/networks/default

  returns: `java.lang.String`"
  (^java.lang.String [^Firewall$Builder this]
    (-> this (.getNetwork))))

(defn add-destination-ranges
  "If destination ranges are specified, the firewall will apply only to traffic that has
   destination IP address in these ranges. These ranges must be expressed in CIDR format. Only
   IPv4 is supported.

  destination-ranges - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this ^java.lang.String destination-ranges]
    (-> this (.addDestinationRanges destination-ranges))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this]
    (-> this (.clone))))

(defn add-all-denied
  "The list of DENY rules specified by this firewall. Each rule specifies a protocol and
   port-range tuple that describes a denied connection.

  denied - `java.util.List`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this ^java.util.List denied]
    (-> this (.addAllDenied denied))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Firewall$Builder this]
    (-> this (.getCreationTimestamp))))

(defn get-log-config
  "This field denotes the logging options for a particular firewall rule. If logging is enabled,
   logs will be exported to Stackdriver.

  returns: `com.google.cloud.compute.v1.FirewallLogConfig`"
  (^com.google.cloud.compute.v1.FirewallLogConfig [^Firewall$Builder this]
    (-> this (.getLogConfig))))

(defn get-allowed-list
  "The list of ALLOW rules specified by this firewall. Each rule specifies a protocol and
   port-range tuple that describes a permitted connection.

  returns: `java.util.List<com.google.cloud.compute.v1.Allowed>`"
  (^java.util.List [^Firewall$Builder this]
    (-> this (.getAllowedList))))

(defn get-priority
  "Priority for this rule. This is an integer between 0 and 65535, both inclusive. When not
   specified, the value assumed is 1000. Relative priorities determine precedence of conflicting
   rules. Lower value of priority implies higher precedence (eg, a rule with priority 0 has
   higher precedence than a rule with priority 1). DENY rules take precedence over ALLOW rules
   having equal priority.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Firewall$Builder this]
    (-> this (.getPriority))))

(defn add-source-tags
  "If source tags are specified, the firewall rule applies only to traffic with source IPs that
   match the primary network interfaces of VM instances that have the tag and are in the same
   VPC network. Source tags cannot be used to control traffic to an instance's external IP
   address, it only applies to traffic between instances in the same virtual network. Because
   tags are associated with instances, not IP addresses. One or both of sourceRanges and
   sourceTags may be set. If both properties are set, the firewall will apply to traffic that
   has source IP address within sourceRanges OR the source IP that belongs to a tag listed in
   the sourceTags property. The connection does not need to match both properties for the
   firewall to apply.

  source-tags - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this ^java.lang.String source-tags]
    (-> this (.addSourceTags source-tags))))

(defn set-disabled
  "Denotes whether the firewall rule is disabled, i.e not applied to the network it is
   associated with. When set to true, the firewall rule is not enforced and the network behaves
   as if it did not exist. If this is unspecified, the firewall rule will be enabled.

  disabled - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this ^java.lang.Boolean disabled]
    (-> this (.setDisabled disabled))))

(defn add-all-allowed
  "The list of ALLOW rules specified by this firewall. Each rule specifies a protocol and
   port-range tuple that describes a permitted connection.

  allowed - `java.util.List`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this ^java.util.List allowed]
    (-> this (.addAllAllowed allowed))))

(defn set-log-config
  "This field denotes the logging options for a particular firewall rule. If logging is enabled,
   logs will be exported to Stackdriver.

  log-config - `com.google.cloud.compute.v1.FirewallLogConfig`

  returns: `com.google.cloud.compute.v1.Firewall$Builder`"
  (^com.google.cloud.compute.v1.Firewall$Builder [^Firewall$Builder this ^com.google.cloud.compute.v1.FirewallLogConfig log-config]
    (-> this (.setLogConfig log-config))))

