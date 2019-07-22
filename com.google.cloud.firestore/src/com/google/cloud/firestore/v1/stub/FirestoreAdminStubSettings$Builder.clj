(ns com.google.cloud.firestore.v1.stub.FirestoreAdminStubSettings$Builder
  "Builder for FirestoreAdminStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.v1.stub FirestoreAdminStubSettings$Builder]))

(defn get-field-settings
  "Returns the builder for the settings used for calls to getField.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.firestore.admin.v1.GetFieldRequest,com.google.firestore.admin.v1.Field>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^FirestoreAdminStubSettings$Builder this]
    (-> this (.getFieldSettings))))

(defn get-index-settings
  "Returns the builder for the settings used for calls to getIndex.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.firestore.admin.v1.GetIndexRequest,com.google.firestore.admin.v1.Index>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^FirestoreAdminStubSettings$Builder this]
    (-> this (.getIndexSettings))))

(defn list-indexes-settings
  "Returns the builder for the settings used for calls to listIndexes.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.firestore.admin.v1.ListIndexesRequest,com.google.firestore.admin.v1.ListIndexesResponse,com.google.cloud.firestore.v1.FirestoreAdminClient$ListIndexesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^FirestoreAdminStubSettings$Builder this]
    (-> this (.listIndexesSettings))))

(defn delete-index-settings
  "Returns the builder for the settings used for calls to deleteIndex.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.firestore.admin.v1.DeleteIndexRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^FirestoreAdminStubSettings$Builder this]
    (-> this (.deleteIndexSettings))))

(defn list-fields-settings
  "Returns the builder for the settings used for calls to listFields.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.firestore.admin.v1.ListFieldsRequest,com.google.firestore.admin.v1.ListFieldsResponse,com.google.cloud.firestore.v1.FirestoreAdminClient$ListFieldsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^FirestoreAdminStubSettings$Builder this]
    (-> this (.listFieldsSettings))))

(defn export-documents-settings
  "Returns the builder for the settings used for calls to exportDocuments.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.firestore.admin.v1.ExportDocumentsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^FirestoreAdminStubSettings$Builder this]
    (-> this (.exportDocumentsSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.firestore.v1.stub.FirestoreAdminStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.firestore.v1.stub.FirestoreAdminStubSettings$Builder [^FirestoreAdminStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn build
  "returns: `com.google.cloud.firestore.v1.stub.FirestoreAdminStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.firestore.v1.stub.FirestoreAdminStubSettings [^FirestoreAdminStubSettings$Builder this]
    (-> this (.build))))

(defn import-documents-settings
  "Returns the builder for the settings used for calls to importDocuments.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.firestore.admin.v1.ImportDocumentsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^FirestoreAdminStubSettings$Builder this]
    (-> this (.importDocumentsSettings))))

(defn update-field-settings
  "Returns the builder for the settings used for calls to updateField.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.firestore.admin.v1.UpdateFieldRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^FirestoreAdminStubSettings$Builder this]
    (-> this (.updateFieldSettings))))

(defn create-index-settings
  "Returns the builder for the settings used for calls to createIndex.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.firestore.admin.v1.CreateIndexRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^FirestoreAdminStubSettings$Builder this]
    (-> this (.createIndexSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^FirestoreAdminStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

