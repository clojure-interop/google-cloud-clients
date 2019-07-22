(ns com.google.cloud.compute.v1.stub.InterconnectAttachmentStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub InterconnectAttachmentStub]))

(defn ->interconnect-attachment-stub
  "Constructor."
  (^InterconnectAttachmentStub []
    (new InterconnectAttachmentStub )))

(defn list-interconnect-attachments-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInterconnectAttachmentsHttpRequest,com.google.cloud.compute.v1.InterconnectAttachmentClient$ListInterconnectAttachmentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectAttachmentStub this]
    (-> this (.listInterconnectAttachmentsPagedCallable))))

(defn aggregated-list-interconnect-attachments-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListInterconnectAttachmentsHttpRequest,com.google.cloud.compute.v1.InterconnectAttachmentClient$AggregatedListInterconnectAttachmentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectAttachmentStub this]
    (-> this (.aggregatedListInterconnectAttachmentsPagedCallable))))

(defn insert-interconnect-attachment-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertInterconnectAttachmentHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectAttachmentStub this]
    (-> this (.insertInterconnectAttachmentCallable))))

(defn list-interconnect-attachments-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInterconnectAttachmentsHttpRequest,com.google.cloud.compute.v1.InterconnectAttachmentList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectAttachmentStub this]
    (-> this (.listInterconnectAttachmentsCallable))))

(defn aggregated-list-interconnect-attachments-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListInterconnectAttachmentsHttpRequest,com.google.cloud.compute.v1.InterconnectAttachmentAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectAttachmentStub this]
    (-> this (.aggregatedListInterconnectAttachmentsCallable))))

(defn patch-interconnect-attachment-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchInterconnectAttachmentHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectAttachmentStub this]
    (-> this (.patchInterconnectAttachmentCallable))))

(defn delete-interconnect-attachment-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteInterconnectAttachmentHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectAttachmentStub this]
    (-> this (.deleteInterconnectAttachmentCallable))))

(defn close
  ""
  ([^InterconnectAttachmentStub this]
    (-> this (.close))))

(defn get-interconnect-attachment-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetInterconnectAttachmentHttpRequest,com.google.cloud.compute.v1.InterconnectAttachment>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectAttachmentStub this]
    (-> this (.getInterconnectAttachmentCallable))))

