(ns com.google.cloud.compute.v1.InterconnectAttachmentsScopedList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectAttachmentsScopedList$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InterconnectAttachmentsScopedList`

  returns: `com.google.cloud.compute.v1.InterconnectAttachmentsScopedList$Builder`"
  (^com.google.cloud.compute.v1.InterconnectAttachmentsScopedList$Builder [^InterconnectAttachmentsScopedList$Builder this ^com.google.cloud.compute.v1.InterconnectAttachmentsScopedList other]
    (-> this (.mergeFrom other))))

(defn get-interconnect-attachments-list
  "A list of interconnect attachments contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.InterconnectAttachment>`"
  (^java.util.List [^InterconnectAttachmentsScopedList$Builder this]
    (-> this (.getInterconnectAttachmentsList))))

(defn add-all-interconnect-attachments
  "A list of interconnect attachments contained in this scope.

  interconnect-attachments - `java.util.List`

  returns: `com.google.cloud.compute.v1.InterconnectAttachmentsScopedList$Builder`"
  (^com.google.cloud.compute.v1.InterconnectAttachmentsScopedList$Builder [^InterconnectAttachmentsScopedList$Builder this ^java.util.List interconnect-attachments]
    (-> this (.addAllInterconnectAttachments interconnect-attachments))))

(defn add-interconnect-attachments
  "A list of interconnect attachments contained in this scope.

  interconnect-attachments - `com.google.cloud.compute.v1.InterconnectAttachment`

  returns: `com.google.cloud.compute.v1.InterconnectAttachmentsScopedList$Builder`"
  (^com.google.cloud.compute.v1.InterconnectAttachmentsScopedList$Builder [^InterconnectAttachmentsScopedList$Builder this ^com.google.cloud.compute.v1.InterconnectAttachment interconnect-attachments]
    (-> this (.addInterconnectAttachments interconnect-attachments))))

(defn get-warning
  "Informational warning which replaces the list of addresses when the list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^InterconnectAttachmentsScopedList$Builder this]
    (-> this (.getWarning))))

(defn set-warning
  "Informational warning which replaces the list of addresses when the list is empty.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.InterconnectAttachmentsScopedList$Builder`"
  (^com.google.cloud.compute.v1.InterconnectAttachmentsScopedList$Builder [^InterconnectAttachmentsScopedList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn build
  "returns: `com.google.cloud.compute.v1.InterconnectAttachmentsScopedList`"
  (^com.google.cloud.compute.v1.InterconnectAttachmentsScopedList [^InterconnectAttachmentsScopedList$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InterconnectAttachmentsScopedList$Builder`"
  (^com.google.cloud.compute.v1.InterconnectAttachmentsScopedList$Builder [^InterconnectAttachmentsScopedList$Builder this]
    (-> this (.clone))))

