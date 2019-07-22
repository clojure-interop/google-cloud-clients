(ns com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectAttachmentPrivateInfo$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo`

  returns: `com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo$Builder`"
  (^com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo$Builder [^InterconnectAttachmentPrivateInfo$Builder this ^com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo other]
    (-> this (.mergeFrom other))))

(defn get-tag-8021q
  "[Output Only] 802.1q encapsulation tag to be used for traffic between Google and the
   customer, going to and from this network and region.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^InterconnectAttachmentPrivateInfo$Builder this]
    (-> this (.getTag8021q))))

(defn set-tag-8021q
  "[Output Only] 802.1q encapsulation tag to be used for traffic between Google and the
   customer, going to and from this network and region.

  tag-8021q - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo$Builder`"
  (^com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo$Builder [^InterconnectAttachmentPrivateInfo$Builder this ^java.lang.Integer tag-8021q]
    (-> this (.setTag8021q tag-8021q))))

(defn build
  "returns: `com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo`"
  (^com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo [^InterconnectAttachmentPrivateInfo$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo$Builder`"
  (^com.google.cloud.compute.v1.InterconnectAttachmentPrivateInfo$Builder [^InterconnectAttachmentPrivateInfo$Builder this]
    (-> this (.clone))))

