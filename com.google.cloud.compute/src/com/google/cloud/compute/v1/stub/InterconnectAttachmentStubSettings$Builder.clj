(ns com.google.cloud.compute.v1.stub.InterconnectAttachmentStubSettings$Builder
  "Builder for InterconnectAttachmentStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub InterconnectAttachmentStubSettings$Builder]))

(defn get-interconnect-attachment-settings
  "Returns the builder for the settings used for calls to getInterconnectAttachment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetInterconnectAttachmentHttpRequest,com.google.cloud.compute.v1.InterconnectAttachment>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InterconnectAttachmentStubSettings$Builder this]
    (-> this (.getInterconnectAttachmentSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.InterconnectAttachmentStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.InterconnectAttachmentStubSettings$Builder [^InterconnectAttachmentStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn aggregated-list-interconnect-attachments-settings
  "Returns the builder for the settings used for calls to aggregatedListInterconnectAttachments.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListInterconnectAttachmentsHttpRequest,com.google.cloud.compute.v1.InterconnectAttachmentAggregatedList,com.google.cloud.compute.v1.InterconnectAttachmentClient$AggregatedListInterconnectAttachmentsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^InterconnectAttachmentStubSettings$Builder this]
    (-> this (.aggregatedListInterconnectAttachmentsSettings))))

(defn delete-interconnect-attachment-settings
  "Returns the builder for the settings used for calls to deleteInterconnectAttachment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteInterconnectAttachmentHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InterconnectAttachmentStubSettings$Builder this]
    (-> this (.deleteInterconnectAttachmentSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.InterconnectAttachmentStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.InterconnectAttachmentStubSettings [^InterconnectAttachmentStubSettings$Builder this]
    (-> this (.build))))

(defn list-interconnect-attachments-settings
  "Returns the builder for the settings used for calls to listInterconnectAttachments.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListInterconnectAttachmentsHttpRequest,com.google.cloud.compute.v1.InterconnectAttachmentList,com.google.cloud.compute.v1.InterconnectAttachmentClient$ListInterconnectAttachmentsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^InterconnectAttachmentStubSettings$Builder this]
    (-> this (.listInterconnectAttachmentsSettings))))

(defn insert-interconnect-attachment-settings
  "Returns the builder for the settings used for calls to insertInterconnectAttachment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertInterconnectAttachmentHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InterconnectAttachmentStubSettings$Builder this]
    (-> this (.insertInterconnectAttachmentSettings))))

(defn patch-interconnect-attachment-settings
  "Returns the builder for the settings used for calls to patchInterconnectAttachment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.PatchInterconnectAttachmentHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InterconnectAttachmentStubSettings$Builder this]
    (-> this (.patchInterconnectAttachmentSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^InterconnectAttachmentStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

