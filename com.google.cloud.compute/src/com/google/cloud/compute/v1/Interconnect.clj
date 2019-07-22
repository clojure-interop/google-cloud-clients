(ns com.google.cloud.compute.v1.Interconnect
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Interconnect]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.Interconnect`

  returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^com.google.cloud.compute.v1.Interconnect prototype]
    (Interconnect/newBuilder prototype))
  (^com.google.cloud.compute.v1.Interconnect$Builder []
    (Interconnect/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.Interconnect`"
  (^com.google.cloud.compute.v1.Interconnect []
    (Interconnect/getDefaultInstance )))

(defn get-expected-outages-list
  "[Output Only] A list of outages expected for this Interconnect.

  returns: `java.util.List<com.google.cloud.compute.v1.InterconnectOutageNotification>`"
  (^java.util.List [^Interconnect this]
    (-> this (.getExpectedOutagesList))))

(defn get-location
  "URL of the InterconnectLocation object that represents where this connection is to be
   provisioned.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect this]
    (-> this (.getLocation))))

(defn get-link-type
  "Type of link requested, which can take one of the following values: -
   LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics - LINK_TYPE_ETHERNET_100G_LR: A 100G
   Ethernet with LR optics. Note that this field indicates the speed of each of the links in the
   bundle, not the speed of the entire bundle.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect this]
    (-> this (.getLinkType))))

(defn get-requested-link-count
  "Target number of physical links in the link bundle, as requested by the customer.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Interconnect this]
    (-> this (.getRequestedLinkCount))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#interconnect for interconnects.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect this]
    (-> this (.getKind))))

(defn get-noc-contact-email
  "Email address to contact the customer NOC for operations and maintenance notifications
   regarding this Interconnect. If specified, this will be used for notifications in addition to
   all other forms described, such as Stackdriver logs alerting and Cloud Notifications.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect this]
    (-> this (.getNocContactEmail))))

(defn get-provisioned-link-count
  "[Output Only] Number of links actually provisioned in this interconnect.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Interconnect this]
    (-> this (.getProvisionedLinkCount))))

(defn get-admin-enabled?
  "Administrative status of the interconnect. When this is set to true, the Interconnect is
   functional and can carry traffic. When set to false, no packets can be carried over the
   interconnect and no BGP routes are exchanged over it. By default, the status is set to true.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^Interconnect this]
    (-> this (.getAdminEnabled))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Interconnect this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Interconnect this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Interconnect this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-google-reference-id
  "[Output Only] Google reference ID to be used when raising support tickets with Google or
   otherwise to debug backend connectivity issues.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect this]
    (-> this (.getGoogleReferenceId))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect this]
    (-> this (.getName))))

(defn get-state
  "[Output Only] The current state of Interconnect functionality, which can take one of the
   following values: - ACTIVE: The Interconnect is valid, turned up and ready to use. Attachments
   may be provisioned on this Interconnect. - UNPROVISIONED: The Interconnect has not completed
   turnup. No attachments may be provisioned on this Interconnect. - UNDER_MAINTENANCE: The
   Interconnect is undergoing internal maintenance. No attachments may be provisioned or updated
   on this Interconnect.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect this]
    (-> this (.getState))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^Interconnect this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect this]
    (-> this (.getSelfLink))))

(defn get-operational-status
  "[Output Only] The current status of this Interconnect's functionality, which can take one of
   the following values: - OS_ACTIVE: A valid Interconnect, which is turned up and is ready to
   use. Attachments may be provisioned on this Interconnect. - OS_UNPROVISIONED: An Interconnect
   that has not completed turnup. No attachments may be provisioned on this Interconnect. -
   OS_UNDER_MAINTENANCE: An Interconnect that is undergoing internal maintenance. No attachments
   may be provisioned or updated on this Interconnect.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect this]
    (-> this (.getOperationalStatus))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Interconnect this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect this]
    (-> this (.getCreationTimestamp))))

(defn get-interconnect-type
  "Type of interconnect, which can take one of the following values: - PARTNER: A partner-managed
   interconnection shared between customers though a partner. - DEDICATED: A dedicated physical
   interconnection with the customer. Note that a value IT_PRIVATE has been deprecated in favor of
   DEDICATED.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect this]
    (-> this (.getInterconnectType))))

(defn get-customer-name
  "Customer name, to put in the Letter of Authorization as the party authorized to request a
   crossconnect.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect this]
    (-> this (.getCustomerName))))

(defn get-google-ip-address
  "[Output Only] IP address configured on the Google side of the Interconnect link. This can be
   used only for ping tests.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect this]
    (-> this (.getGoogleIpAddress))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Interconnect this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-circuit-infos-list
  "[Output Only] A list of CircuitInfo objects, that describe the individual circuits in this LAG.

  returns: `java.util.List<com.google.cloud.compute.v1.InterconnectCircuitInfo>`"
  (^java.util.List [^Interconnect this]
    (-> this (.getCircuitInfosList))))

(defn get-peer-ip-address
  "[Output Only] IP address configured on the customer side of the Interconnect link. The customer
   should configure this IP address during turnup when prompted by Google NOC. This can be used
   only for ping tests.

  returns: `java.lang.String`"
  (^java.lang.String [^Interconnect this]
    (-> this (.getPeerIpAddress))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.Interconnect$Builder`"
  (^com.google.cloud.compute.v1.Interconnect$Builder [^Interconnect this]
    (-> this (.toBuilder))))

(defn get-interconnect-attachments-list
  "[Output Only] A list of the URLs of all InterconnectAttachments configured to use this
   Interconnect.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Interconnect this]
    (-> this (.getInterconnectAttachmentsList))))

