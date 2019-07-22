(ns com.google.cloud.compute.v1.InterconnectAttachment
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectAttachment]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InterconnectAttachment`

  returns: `com.google.cloud.compute.v1.InterconnectAttachment$Builder`"
  (^com.google.cloud.compute.v1.InterconnectAttachment$Builder [^com.google.cloud.compute.v1.InterconnectAttachment prototype]
    (InterconnectAttachment/newBuilder prototype))
  (^com.google.cloud.compute.v1.InterconnectAttachment$Builder []
    (InterconnectAttachment/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InterconnectAttachment`"
  (^com.google.cloud.compute.v1.InterconnectAttachment []
    (InterconnectAttachment/getDefaultInstance )))

(defn get-bandwidth
  "Provisioned bandwidth capacity for the interconnect attachment. For attachments of type
   DEDICATED, the user can set the bandwidth. For attachments of type PARTNER, the Google Partner
   that is operating the interconnect must set the bandwidth. Output only for PARTNER type,
   mutable for PARTNER_PROVIDER and DEDICATED, and can take one of the following values: -
   BPS_50M: 50 Mbit/s - BPS_100M: 100 Mbit/s - BPS_200M: 200 Mbit/s - BPS_300M: 300 Mbit/s -
   BPS_400M: 400 Mbit/s - BPS_500M: 500 Mbit/s - BPS_1G: 1 Gbit/s - BPS_2G: 2 Gbit/s - BPS_5G: 5
   Gbit/s - BPS_10G: 10 Gbit/s

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachment this]
    (-> this (.getBandwidth))))

(defn get-partner-metadata
  "Informational metadata about Partner attachments from Partners to display to customers. Output
   only for for PARTNER type, mutable for PARTNER_PROVIDER, not available for DEDICATED.

  returns: `com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata`"
  (^com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata [^InterconnectAttachment this]
    (-> this (.getPartnerMetadata))))

(defn get-type
  "The type of interconnect attachment this is, which can take one of the following values: -
   DEDICATED: an attachment to a Dedicated Interconnect. - PARTNER: an attachment to a Partner
   Interconnect, created by the customer. - PARTNER_PROVIDER: an attachment to a Partner
   Interconnect, created by the partner.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachment this]
    (-> this (.getType))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#interconnectAttachment for interconnect
   attachments.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachment this]
    (-> this (.getKind))))

(defn get-candidate-subnets-list
  "Up to 16 candidate prefixes that can be used to restrict the allocation of cloudRouterIpAddress
   and customerRouterIpAddress for this attachment. All prefixes must be within link-local address
   space (169.254.0.0/16) and must be /29 or shorter (/28, /27, etc). Google will attempt to
   select an unused /29 from the supplied candidate prefix(es). The request will fail if all
   possible /29s are in use on Google?s edge. If not supplied, Google will randomly select an
   unused /29 from all of link-local space.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InterconnectAttachment this]
    (-> this (.getCandidateSubnetsList))))

(defn get-cloud-router-ip-address
  "[Output Only] IPv4 address  prefix length to be configured on Cloud Router Interface for this
   interconnect attachment.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachment this]
    (-> this (.getCloudRouterIpAddress))))

(defn get-edge-availability-domain
  "Desired availability domain for the attachment. Only available for type PARTNER, at creation
   time, and can take one of the following values: - AVAILABILITY_DOMAIN_ANY -
   AVAILABILITY_DOMAIN_1 - AVAILABILITY_DOMAIN_2 For improved reliability, customers should
   configure a pair of attachments, one per availability domain. The selected availability domain
   will be provided to the Partner via the pairing key, so that the provisioned circuit will lie
   in the specified domain. If not specified, the value will default to AVAILABILITY_DOMAIN_ANY.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachment this]
    (-> this (.getEdgeAvailabilityDomain))))

(defn get-interconnect
  "URL of the underlying Interconnect object that this attachment's traffic will traverse through.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachment this]
    (-> this (.getInterconnect))))

(defn get-admin-enabled?
  "Determines whether this Attachment will carry packets. Not present for PARTNER_PROVIDER.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^InterconnectAttachment this]
    (-> this (.getAdminEnabled))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InterconnectAttachment this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachment this]
    (-> this (.toString))))

(defn get-vlan-tag-8021q
  "The IEEE 802.1Q VLAN tag for this attachment, in the range 2-4094. Only specified at creation
   time.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^InterconnectAttachment this]
    (-> this (.getVlanTag8021q))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InterconnectAttachment this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-google-reference-id
  "[Output Only] Google reference ID, to be used when raising support tickets with Google or
   otherwise to debug backend connectivity issues.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachment this]
    (-> this (.getGoogleReferenceId))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachment this]
    (-> this (.getName))))

(defn get-state
  "[Output Only] The current state of this attachment's functionality. Enum values ACTIVE and
   UNPROVISIONED are shared by DEDICATED/PRIVATE, PARTNER, and PARTNER_PROVIDER interconnect
   attachments, while enum values PENDING_PARTNER, PARTNER_REQUEST_RECEIVED, and PENDING_CUSTOMER
   are used for only PARTNER and PARTNER_PROVIDER interconnect attachments. This state can take
   one of the following values: - ACTIVE: The attachment has been turned up and is ready to use. -
   UNPROVISIONED: The attachment is not ready to use yet, because turnup is not complete. -
   PENDING_PARTNER: A newly-created PARTNER attachment that has not yet been configured on the
   Partner side. - PARTNER_REQUEST_RECEIVED: A PARTNER attachment is in the process of
   provisioning after a PARTNER_PROVIDER attachment was created that references it. -
   PENDING_CUSTOMER: A PARTNER or PARTNER_PROVIDER attachment that is waiting for a customer to
   activate it. - DEFUNCT: The attachment was deleted externally and is no longer functional. This
   could be because the associated Interconnect was removed, or because the other side of a
   Partner attachment was deleted.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachment this]
    (-> this (.getState))))

(defn get-description
  "An optional description of this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachment this]
    (-> this (.getDescription))))

(defn get-customer-router-ip-address
  "[Output Only] IPv4 address  prefix length to be configured on the customer router subinterface
   for this interconnect attachment.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachment this]
    (-> this (.getCustomerRouterIpAddress))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachment this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InterconnectAttachment this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachment this]
    (-> this (.getSelfLink))))

(defn get-operational-status
  "[Output Only] The current status of whether or not this interconnect attachment is functional,
   which can take one of the following values: - OS_ACTIVE: The attachment has been turned up and
   is ready to use. - OS_UNPROVISIONED: The attachment is not ready to use yet, because turnup is
   not complete.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachment this]
    (-> this (.getOperationalStatus))))

(defn get-private-interconnect-info
  "[Output Only] Information specific to an InterconnectAttachment. This property is populated if
   the interconnect that this is attached to is of type DEDICATED.

  returns: `com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo`"
  (^com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo [^InterconnectAttachment this]
    (-> this (.getPrivateInterconnectInfo))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InterconnectAttachment this]
    (-> this (.hashCode))))

(defn get-pairing-key
  "[Output only for type PARTNER. Input only for PARTNER_PROVIDER. Not present for DEDICATED]. The
   opaque identifier of an PARTNER attachment used to initiate provisioning with a selected
   partner. Of the form \"XXXXX/region/domain\"

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachment this]
    (-> this (.getPairingKey))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachment this]
    (-> this (.getCreationTimestamp))))

(defn get-router
  "URL of the Cloud Router to be used for dynamic routing. This router must be in the same region
   as this InterconnectAttachment. The InterconnectAttachment will automatically connect the
   Interconnect to the network & region within which the Cloud Router is configured.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachment this]
    (-> this (.getRouter))))

(defn get-partner-asn
  "Optional BGP ASN for the router supplied by a Layer 3 Partner if they configured BGP on behalf
   of the customer. Output only for PARTNER type, input only for PARTNER_PROVIDER, not available
   for DEDICATED.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachment this]
    (-> this (.getPartnerAsn))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InterconnectAttachment this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "[Output Only] URL of the region where the regional interconnect attachment resides. You must
   specify this field as part of the HTTP request URL. It is not settable as a field in the
   request body.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachment this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InterconnectAttachment$Builder`"
  (^com.google.cloud.compute.v1.InterconnectAttachment$Builder [^InterconnectAttachment this]
    (-> this (.toBuilder))))

