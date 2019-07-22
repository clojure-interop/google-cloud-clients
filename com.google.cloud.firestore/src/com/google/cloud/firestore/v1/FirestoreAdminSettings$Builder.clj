(ns com.google.cloud.firestore.v1.FirestoreAdminSettings$Builder
  "Builder for FirestoreAdminSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.v1 FirestoreAdminSettings$Builder]))

(defn get-field-settings
  "Returns the builder for the settings used for calls to getField.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.firestore.admin.v1.GetFieldRequest,com.google.firestore.admin.v1.Field>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^FirestoreAdminSettings$Builder this]
    (-> this (.getFieldSettings))))

(defn get-index-settings
  "Returns the builder for the settings used for calls to getIndex.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.firestore.admin.v1.GetIndexRequest,com.google.firestore.admin.v1.Index>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^FirestoreAdminSettings$Builder this]
    (-> this (.getIndexSettings))))

(defn list-indexes-settings
  "Returns the builder for the settings used for calls to listIndexes.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.firestore.admin.v1.ListIndexesRequest,com.google.firestore.admin.v1.ListIndexesResponse,com.google.cloud.firestore.v1.FirestoreAdminClient$ListIndexesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^FirestoreAdminSettings$Builder this]
    (-> this (.listIndexesSettings))))

(defn delete-index-settings
  "Returns the builder for the settings used for calls to deleteIndex.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.firestore.admin.v1.DeleteIndexRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^FirestoreAdminSettings$Builder this]
    (-> this (.deleteIndexSettings))))

(defn list-fields-settings
  "Returns the builder for the settings used for calls to listFields.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.firestore.admin.v1.ListFieldsRequest,com.google.firestore.admin.v1.ListFieldsResponse,com.google.cloud.firestore.v1.FirestoreAdminClient$ListFieldsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^FirestoreAdminSettings$Builder this]
    (-> this (.listFieldsSettings))))

(defn export-documents-settings
  "Returns the builder for the settings used for calls to exportDocuments.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.firestore.admin.v1.ExportDocumentsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^FirestoreAdminSettings$Builder this]
    (-> this (.exportDocumentsSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.firestore.v1.FirestoreAdminSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.firestore.v1.FirestoreAdminSettings$Builder [^FirestoreAdminSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn build
  "returns: `com.google.cloud.firestore.v1.FirestoreAdminSettings`

  throws: java.io.IOException"
  (^com.google.cloud.firestore.v1.FirestoreAdminSettings [^FirestoreAdminSettings$Builder this]
    (-> this (.build))))

(defn import-documents-settings
  "Returns the builder for the settings used for calls to importDocuments.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.firestore.admin.v1.ImportDocumentsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^FirestoreAdminSettings$Builder this]
    (-> this (.importDocumentsSettings))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.firestore.v1.stub.FirestoreAdminStubSettings$Builder`"
  (^com.google.cloud.firestore.v1.stub.FirestoreAdminStubSettings$Builder [^FirestoreAdminSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn update-field-settings
  "Returns the builder for the settings used for calls to updateField.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.firestore.admin.v1.UpdateFieldRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^FirestoreAdminSettings$Builder this]
    (-> this (.updateFieldSettings))))

(defn create-index-settings
  "Returns the builder for the settings used for calls to createIndex.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.firestore.admin.v1.CreateIndexRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^FirestoreAdminSettings$Builder this]
    (-> this (.createIndexSettings))))

