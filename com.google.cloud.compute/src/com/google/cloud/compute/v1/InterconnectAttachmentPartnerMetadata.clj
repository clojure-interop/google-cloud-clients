(ns com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectAttachmentPartnerMetadata]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata`

  returns: `com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata$Builder`"
  (^com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata$Builder [^com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata prototype]
    (InterconnectAttachmentPartnerMetadata/newBuilder prototype))
  (^com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata$Builder []
    (InterconnectAttachmentPartnerMetadata/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata`"
  (^com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata []
    (InterconnectAttachmentPartnerMetadata/getDefaultInstance )))

(defn get-portal-url
  "URL of the Partner?s portal for this Attachment. Partners may customise this to be a deep link
   to the specific resource on the Partner portal. This value may be validated to match approved
   Partner values.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachmentPartnerMetadata this]
    (-> this (.getPortalUrl))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InterconnectAttachmentPartnerMetadata this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachmentPartnerMetadata this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InterconnectAttachmentPartnerMetadata this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-partner-name
  "Plain text name of the Partner providing this attachment. This value may be validated to match
   approved Partner values.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachmentPartnerMetadata this]
    (-> this (.getPartnerName))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InterconnectAttachmentPartnerMetadata this]
    (-> this (.getApiMessageRequestBody))))

(defn get-interconnect-name
  "Plain text name of the Interconnect this attachment is connected to, as displayed in the
   Partner?s portal. For instance \"Chicago 1\". This value may be validated to match approved
   Partner values.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachmentPartnerMetadata this]
    (-> this (.getInterconnectName))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InterconnectAttachmentPartnerMetadata this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InterconnectAttachmentPartnerMetadata this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata$Builder`"
  (^com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata$Builder [^InterconnectAttachmentPartnerMetadata this]
    (-> this (.toBuilder))))

