(ns com.google.cloud.compute.v1.Interconnect$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Interconnect$Builder]))

(defn get-expected-outages-list
  "[Output Only] A list of outages expected for this Interconnect.

  returns: `java.util.List<com.google.cloud.compute.v1.InterconnectOutageNotification>`"
  (^java.util.List [^Interconnect$Builder this]
    (-> this (.getExpectedOutagesList))))

(defn set-admin-enabled
  "Administrative status of the interconnect. When this is set to true, the Interconnect is
   functional and can carry traffic. When set to false, no packets can be carried over the
   interconnect and no BGP routes are exchanged over it. By default, the status is set to true.

  admin-enabled - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^Interconnect$Builder this ^java.lang.Boolean admin-enabled]
    (-> this (.setAdminEnabled admin-enabled))))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^Interconnect$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-operational-status
  "[Output Only] The current status of this Interconnect's functionality, which can take one of
   the following values: - OS_ACTIVE: A valid Interconnect, which is turned up and is ready to
   use. Attachments may be provisioned on this Interconnect. - OS_UNPROVISIONED: An Interconnect
   that has not completed turnup. No attachments may be provisioned on this Interconnect. -
   OS_UNDER_MAINTENANCE: An Interconnect that is undergoing internal maintenance. No attachments
   may be provisioned or updated on this Interconnect.

  operational-status - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^Interconnect$Builder this ^java.lang.String operational-status]
    (-> this (.setOperationalStatus operational-status))))

(defn set-link-type
  "Type of link requested, which can take one of the following values: -
   LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics - LINK_TYPE_ETHERNET_100G_LR: A 100G
   Ethernet with LR optics. Note that this field indicates the speed of each of the links in the
   bundle, not the speed of the entire bundle.

  link-type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^Interconnect$Builder this ^java.lang.String link-type]
    (-> this (.setLinkType link-type))))

(defn get-location
  "URL of the InterconnectLocation object that represents where this connection is to be
   provisioned.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect$Builder this]
    (-> this (.getLocation))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^Interconnect$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn set-location
  "URL of the InterconnectLocation object that represents where this connection is to be
   provisioned.

  location - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^Interconnect$Builder this ^java.lang.String location]
    (-> this (.setLocation location))))

(defn get-link-type
  "Type of link requested, which can take one of the following values: -
   LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics - LINK_TYPE_ETHERNET_100G_LR: A 100G
   Ethernet with LR optics. Note that this field indicates the speed of each of the links in the
   bundle, not the speed of the entire bundle.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect$Builder this]
    (-> this (.getLinkType))))

(defn set-customer-name
  "Customer name, to put in the Letter of Authorization as the party authorized to request a
   crossconnect.

  customer-name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^Interconnect$Builder this ^java.lang.String customer-name]
    (-> this (.setCustomerName customer-name))))

(defn get-requested-link-count
  "Target number of physical links in the link bundle, as requested by the customer.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Interconnect$Builder this]
    (-> this (.getRequestedLinkCount))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#interconnect for interconnects.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect$Builder this]
    (-> this (.getKind))))

(defn get-noc-contact-email
  "Email address to contact the customer NOC for operations and maintenance notifications
   regarding this Interconnect. If specified, this will be used for notifications in addition to
   all other forms described, such as Stackdriver logs alerting and Cloud Notifications.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect$Builder this]
    (-> this (.getNocContactEmail))))

(defn set-interconnect-type
  "Type of interconnect, which can take one of the following values: - PARTNER: A
   partner-managed interconnection shared between customers though a partner. - DEDICATED: A
   dedicated physical interconnection with the customer. Note that a value IT_PRIVATE has been
   deprecated in favor of DEDICATED.

  interconnect-type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^Interconnect$Builder this ^java.lang.String interconnect-type]
    (-> this (.setInterconnectType interconnect-type))))

(defn get-provisioned-link-count
  "[Output Only] Number of links actually provisioned in this interconnect.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Interconnect$Builder this]
    (-> this (.getProvisionedLinkCount))))

(defn add-all-interconnect-attachments
  "[Output Only] A list of the URLs of all InterconnectAttachments configured to use this
   Interconnect.

  interconnect-attachments - `java.util.List`

  returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^Interconnect$Builder this ^java.util.List interconnect-attachments]
    (-> this (.addAllInterconnectAttachments interconnect-attachments))))

(defn set-google-reference-id
  "[Output Only] Google reference ID to be used when raising support tickets with Google or
   otherwise to debug backend connectivity issues.

  google-reference-id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^Interconnect$Builder this ^java.lang.String google-reference-id]
    (-> this (.setGoogleReferenceId google-reference-id))))

(defn set-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^Interconnect$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn get-admin-enabled?
  "Administrative status of the interconnect. When this is set to true, the Interconnect is
   functional and can carry traffic. When set to false, no packets can be carried over the
   interconnect and no BGP routes are exchanged over it. By default, the status is set to true.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^Interconnect$Builder this]
    (-> this (.getAdminEnabled))))

(defn set-requested-link-count
  "Target number of physical links in the link bundle, as requested by the customer.

  requested-link-count - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^Interconnect$Builder this ^java.lang.Integer requested-link-count]
    (-> this (.setRequestedLinkCount requested-link-count))))

(defn add-all-circuit-infos
  "[Output Only] A list of CircuitInfo objects, that describe the individual circuits in this
   LAG.

  circuit-infos - `java.util.List`

  returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^Interconnect$Builder this ^java.util.List circuit-infos]
    (-> this (.addAllCircuitInfos circuit-infos))))

(defn set-kind
  "[Output Only] Type of the resource. Always compute#interconnect for interconnects.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^Interconnect$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn set-noc-contact-email
  "Email address to contact the customer NOC for operations and maintenance notifications
   regarding this Interconnect. If specified, this will be used for notifications in addition to
   all other forms described, such as Stackdriver logs alerting and Cloud Notifications.

  noc-contact-email - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^Interconnect$Builder this ^java.lang.String noc-contact-email]
    (-> this (.setNocContactEmail noc-contact-email))))

(defn set-state
  "[Output Only] The current state of Interconnect functionality, which can take one of the
   following values: - ACTIVE: The Interconnect is valid, turned up and ready to use.
   Attachments may be provisioned on this Interconnect. - UNPROVISIONED: The Interconnect has
   not completed turnup. No attachments may be provisioned on this Interconnect. -
   UNDER_MAINTENANCE: The Interconnect is undergoing internal maintenance. No attachments may be
   provisioned or updated on this Interconnect.

  state - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^Interconnect$Builder this ^java.lang.String state]
    (-> this (.setState state))))

(defn get-google-reference-id
  "[Output Only] Google reference ID to be used when raising support tickets with Google or
   otherwise to debug backend connectivity issues.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect$Builder this]
    (-> this (.getGoogleReferenceId))))

(defn add-interconnect-attachments
  "[Output Only] A list of the URLs of all InterconnectAttachments configured to use this
   Interconnect.

  interconnect-attachments - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^Interconnect$Builder this ^java.lang.String interconnect-attachments]
    (-> this (.addInterconnectAttachments interconnect-attachments))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^Interconnect$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn get-state
  "[Output Only] The current state of Interconnect functionality, which can take one of the
   following values: - ACTIVE: The Interconnect is valid, turned up and ready to use.
   Attachments may be provisioned on this Interconnect. - UNPROVISIONED: The Interconnect has
   not completed turnup. No attachments may be provisioned on this Interconnect. -
   UNDER_MAINTENANCE: The Interconnect is undergoing internal maintenance. No attachments may be
   provisioned or updated on this Interconnect.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect$Builder this]
    (-> this (.getState))))

(defn build
  "returns: `com.google.cloud.compute.v1.Interconnect`"
  (^com.google.cloud.compute.v1.Interconnect [^Interconnect$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect$Builder this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^Interconnect$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn set-provisioned-link-count
  "[Output Only] Number of links actually provisioned in this interconnect.

  provisioned-link-count - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^Interconnect$Builder this ^java.lang.Integer provisioned-link-count]
    (-> this (.setProvisionedLinkCount provisioned-link-count))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Interconnect`

  returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^Interconnect$Builder this ^com.google.cloud.compute.v1.Interconnect other]
    (-> this (.mergeFrom other))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect$Builder this]
    (-> this (.getSelfLink))))

(defn add-expected-outages
  "[Output Only] A list of outages expected for this Interconnect.

  expected-outages - `com.google.cloud.compute.v1.InterconnectOutageNotification`

  returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^Interconnect$Builder this ^com.google.cloud.compute.v1.InterconnectOutageNotification expected-outages]
    (-> this (.addExpectedOutages expected-outages))))

(defn get-operational-status
  "[Output Only] The current status of this Interconnect's functionality, which can take one of
   the following values: - OS_ACTIVE: A valid Interconnect, which is turned up and is ready to
   use. Attachments may be provisioned on this Interconnect. - OS_UNPROVISIONED: An Interconnect
   that has not completed turnup. No attachments may be provisioned on this Interconnect. -
   OS_UNDER_MAINTENANCE: An Interconnect that is undergoing internal maintenance. No attachments
   may be provisioned or updated on this Interconnect.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect$Builder this]
    (-> this (.getOperationalStatus))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^Interconnect$Builder this]
    (-> this (.clone))))

(defn add-all-expected-outages
  "[Output Only] A list of outages expected for this Interconnect.

  expected-outages - `java.util.List`

  returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^Interconnect$Builder this ^java.util.List expected-outages]
    (-> this (.addAllExpectedOutages expected-outages))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect$Builder this]
    (-> this (.getCreationTimestamp))))

(defn set-google-ip-address
  "[Output Only] IP address configured on the Google side of the Interconnect link. This can be
   used only for ping tests.

  google-ip-address - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^Interconnect$Builder this ^java.lang.String google-ip-address]
    (-> this (.setGoogleIpAddress google-ip-address))))

(defn get-interconnect-type
  "Type of interconnect, which can take one of the following values: - PARTNER: A
   partner-managed interconnection shared between customers though a partner. - DEDICATED: A
   dedicated physical interconnection with the customer. Note that a value IT_PRIVATE has been
   deprecated in favor of DEDICATED.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect$Builder this]
    (-> this (.getInterconnectType))))

(defn get-customer-name
  "Customer name, to put in the Letter of Authorization as the party authorized to request a
   crossconnect.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect$Builder this]
    (-> this (.getCustomerName))))

(defn set-peer-ip-address
  "[Output Only] IP address configured on the customer side of the Interconnect link. The
   customer should configure this IP address during turnup when prompted by Google NOC. This can
   be used only for ping tests.

  peer-ip-address - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^Interconnect$Builder this ^java.lang.String peer-ip-address]
    (-> this (.setPeerIpAddress peer-ip-address))))

(defn get-google-ip-address
  "[Output Only] IP address configured on the Google side of the Interconnect link. This can be
   used only for ping tests.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect$Builder this]
    (-> this (.getGoogleIpAddress))))

(defn get-circuit-infos-list
  "[Output Only] A list of CircuitInfo objects, that describe the individual circuits in this
   LAG.

  returns: `java.util.List<com.google.cloud.compute.v1.InterconnectCircuitInfo>`"
  (^java.util.List [^Interconnect$Builder this]
    (-> this (.getCircuitInfosList))))

(defn get-peer-ip-address
  "[Output Only] IP address configured on the customer side of the Interconnect link. The
   customer should configure this IP address during turnup when prompted by Google NOC. This can
   be used only for ping tests.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect$Builder this]
    (-> this (.getPeerIpAddress))))

(defn add-circuit-infos
  "[Output Only] A list of CircuitInfo objects, that describe the individual circuits in this
   LAG.

  circuit-infos - `com.google.cloud.compute.v1.InterconnectCircuitInfo`

  returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^Interconnect$Builder this ^com.google.cloud.compute.v1.InterconnectCircuitInfo circuit-infos]
    (-> this (.addCircuitInfos circuit-infos))))

(defn get-interconnect-attachments-list
  "[Output Only] A list of the URLs of all InterconnectAttachments configured to use this
   Interconnect.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Interconnect$Builder this]
    (-> this (.getInterconnectAttachmentsList))))

