(ns com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectAttachmentPartnerMetadata$Builder]))

(defn get-portal-url
  "URL of the Partner?s portal for this Attachment. Partners may customise this to be a deep
   link to the specific resource on the Partner portal. This value may be validated to match
   approved Partner values.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachmentPartnerMetadata$Builder this]
    (-> this (.getPortalUrl))))

(defn set-partner-name
  "Plain text name of the Partner providing this attachment. This value may be validated to
   match approved Partner values.

  partner-name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata$Builder`"
  (^com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata$Builder [^InterconnectAttachmentPartnerMetadata$Builder this ^java.lang.String partner-name]
    (-> this (.setPartnerName partner-name))))

(defn build
  "returns: `com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata`"
  (^com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata [^InterconnectAttachmentPartnerMetadata$Builder this]
    (-> this (.build))))

(defn set-portal-url
  "URL of the Partner?s portal for this Attachment. Partners may customise this to be a deep
   link to the specific resource on the Partner portal. This value may be validated to match
   approved Partner values.

  portal-url - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata$Builder`"
  (^com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata$Builder [^InterconnectAttachmentPartnerMetadata$Builder this ^java.lang.String portal-url]
    (-> this (.setPortalUrl portal-url))))

(defn get-partner-name
  "Plain text name of the Partner providing this attachment. This value may be validated to
   match approved Partner values.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachmentPartnerMetadata$Builder this]
    (-> this (.getPartnerName))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata`

  returns: `com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata$Builder`"
  (^com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata$Builder [^InterconnectAttachmentPartnerMetadata$Builder this ^com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata other]
    (-> this (.mergeFrom other))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata$Builder`"
  (^com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata$Builder [^InterconnectAttachmentPartnerMetadata$Builder this]
    (-> this (.clone))))

(defn get-interconnect-name
  "Plain text name of the Interconnect this attachment is connected to, as displayed in the
   Partner?s portal. For instance \"Chicago 1\". This value may be validated to match approved
   Partner values.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachmentPartnerMetadata$Builder this]
    (-> this (.getInterconnectName))))

(defn set-interconnect-name
  "Plain text name of the Interconnect this attachment is connected to, as displayed in the
   Partner?s portal. For instance \"Chicago 1\". This value may be validated to match approved
   Partner values.

  interconnect-name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata$Builder`"
  (^com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata$Builder [^InterconnectAttachmentPartnerMetadata$Builder this ^java.lang.String interconnect-name]
    (-> this (.setInterconnectName interconnect-name))))

