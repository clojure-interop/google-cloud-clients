(ns com.google.cloud.compute.v1.stub.HttpJsonInterconnectAttachmentStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonInterconnectAttachmentStub]))

(def *-aggregated-list-interconnect-attachments-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AggregatedListInterconnectAttachmentsHttpRequest,com.google.cloud.compute.v1.InterconnectAttachmentAggregatedList>"
  HttpJsonInterconnectAttachmentStub/aggregatedListInterconnectAttachmentsMethodDescriptor)

(def *-delete-interconnect-attachment-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteInterconnectAttachmentHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInterconnectAttachmentStub/deleteInterconnectAttachmentMethodDescriptor)

(def *-get-interconnect-attachment-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetInterconnectAttachmentHttpRequest,com.google.cloud.compute.v1.InterconnectAttachment>"
  HttpJsonInterconnectAttachmentStub/getInterconnectAttachmentMethodDescriptor)

(def *-insert-interconnect-attachment-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertInterconnectAttachmentHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInterconnectAttachmentStub/insertInterconnectAttachmentMethodDescriptor)

(def *-list-interconnect-attachments-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListInterconnectAttachmentsHttpRequest,com.google.cloud.compute.v1.InterconnectAttachmentList>"
  HttpJsonInterconnectAttachmentStub/listInterconnectAttachmentsMethodDescriptor)

(def *-patch-interconnect-attachment-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.PatchInterconnectAttachmentHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInterconnectAttachmentStub/patchInterconnectAttachmentMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonInterconnectAttachmentStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonInterconnectAttachmentStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonInterconnectAttachmentStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonInterconnectAttachmentStub [^com.google.cloud.compute.v1.stub.InterconnectAttachmentStubSettings settings]
    (HttpJsonInterconnectAttachmentStub/create settings)))

(defn list-interconnect-attachments-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInterconnectAttachmentsHttpRequest,com.google.cloud.compute.v1.InterconnectAttachmentClient$ListInterconnectAttachmentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInterconnectAttachmentStub this]
    (-> this (.listInterconnectAttachmentsPagedCallable))))

(defn aggregated-list-interconnect-attachments-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListInterconnectAttachmentsHttpRequest,com.google.cloud.compute.v1.InterconnectAttachmentClient$AggregatedListInterconnectAttachmentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInterconnectAttachmentStub this]
    (-> this (.aggregatedListInterconnectAttachmentsPagedCallable))))

(defn insert-interconnect-attachment-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertInterconnectAttachmentHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInterconnectAttachmentStub this]
    (-> this (.insertInterconnectAttachmentCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonInterconnectAttachmentStub this]
    (-> this (.isShutdown))))

(defn list-interconnect-attachments-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInterconnectAttachmentsHttpRequest,com.google.cloud.compute.v1.InterconnectAttachmentList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInterconnectAttachmentStub this]
    (-> this (.listInterconnectAttachmentsCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonInterconnectAttachmentStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn aggregated-list-interconnect-attachments-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListInterconnectAttachmentsHttpRequest,com.google.cloud.compute.v1.InterconnectAttachmentAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInterconnectAttachmentStub this]
    (-> this (.aggregatedListInterconnectAttachmentsCallable))))

(defn shutdown
  ""
  ([^HttpJsonInterconnectAttachmentStub this]
    (-> this (.shutdown))))

(defn patch-interconnect-attachment-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchInterconnectAttachmentHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInterconnectAttachmentStub this]
    (-> this (.patchInterconnectAttachmentCallable))))

(defn delete-interconnect-attachment-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteInterconnectAttachmentHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInterconnectAttachmentStub this]
    (-> this (.deleteInterconnectAttachmentCallable))))

(defn close
  ""
  ([^HttpJsonInterconnectAttachmentStub this]
    (-> this (.close))))

(defn get-interconnect-attachment-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetInterconnectAttachmentHttpRequest,com.google.cloud.compute.v1.InterconnectAttachment>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInterconnectAttachmentStub this]
    (-> this (.getInterconnectAttachmentCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonInterconnectAttachmentStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^HttpJsonInterconnectAttachmentStub this]
    (-> this (.shutdownNow))))

