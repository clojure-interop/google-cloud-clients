(ns com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrafeasV1Beta1StubSettings$Builder
  "Builder for GrafeasV1Beta1StubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.devtools.containeranalysis.v1beta1.stub GrafeasV1Beta1StubSettings$Builder]))

(defn delete-note-settings
  "Returns the builder for the settings used for calls to deleteNote.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<io.grafeas.v1beta1.DeleteNoteRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GrafeasV1Beta1StubSettings$Builder this]
    (-> this (.deleteNoteSettings))))

(defn create-occurrence-settings
  "Returns the builder for the settings used for calls to createOccurrence.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<io.grafeas.v1beta1.CreateOccurrenceRequest,io.grafeas.v1beta1.Occurrence>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GrafeasV1Beta1StubSettings$Builder this]
    (-> this (.createOccurrenceSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrafeasV1Beta1StubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrafeasV1Beta1StubSettings$Builder [^GrafeasV1Beta1StubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn get-vulnerability-occurrences-summary-settings
  "Returns the builder for the settings used for calls to getVulnerabilityOccurrencesSummary.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<io.grafeas.v1beta1.GetVulnerabilityOccurrencesSummaryRequest,io.grafeas.v1beta1.VulnerabilityOccurrencesSummary>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GrafeasV1Beta1StubSettings$Builder this]
    (-> this (.getVulnerabilityOccurrencesSummarySettings))))

(defn update-occurrence-settings
  "Returns the builder for the settings used for calls to updateOccurrence.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<io.grafeas.v1beta1.UpdateOccurrenceRequest,io.grafeas.v1beta1.Occurrence>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GrafeasV1Beta1StubSettings$Builder this]
    (-> this (.updateOccurrenceSettings))))

(defn get-occurrence-settings
  "Returns the builder for the settings used for calls to getOccurrence.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<io.grafeas.v1beta1.GetOccurrenceRequest,io.grafeas.v1beta1.Occurrence>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GrafeasV1Beta1StubSettings$Builder this]
    (-> this (.getOccurrenceSettings))))

(defn get-note-settings
  "Returns the builder for the settings used for calls to getNote.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<io.grafeas.v1beta1.GetNoteRequest,io.grafeas.v1beta1.Note>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GrafeasV1Beta1StubSettings$Builder this]
    (-> this (.getNoteSettings))))

(defn update-note-settings
  "Returns the builder for the settings used for calls to updateNote.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<io.grafeas.v1beta1.UpdateNoteRequest,io.grafeas.v1beta1.Note>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GrafeasV1Beta1StubSettings$Builder this]
    (-> this (.updateNoteSettings))))

(defn list-occurrences-settings
  "Returns the builder for the settings used for calls to listOccurrences.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<io.grafeas.v1beta1.ListOccurrencesRequest,io.grafeas.v1beta1.ListOccurrencesResponse,com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListOccurrencesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^GrafeasV1Beta1StubSettings$Builder this]
    (-> this (.listOccurrencesSettings))))

(defn delete-occurrence-settings
  "Returns the builder for the settings used for calls to deleteOccurrence.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<io.grafeas.v1beta1.DeleteOccurrenceRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GrafeasV1Beta1StubSettings$Builder this]
    (-> this (.deleteOccurrenceSettings))))

(defn build
  "returns: `com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrafeasV1Beta1StubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrafeasV1Beta1StubSettings [^GrafeasV1Beta1StubSettings$Builder this]
    (-> this (.build))))

(defn get-occurrence-note-settings
  "Returns the builder for the settings used for calls to getOccurrenceNote.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<io.grafeas.v1beta1.GetOccurrenceNoteRequest,io.grafeas.v1beta1.Note>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GrafeasV1Beta1StubSettings$Builder this]
    (-> this (.getOccurrenceNoteSettings))))

(defn list-note-occurrences-settings
  "Returns the builder for the settings used for calls to listNoteOccurrences.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<io.grafeas.v1beta1.ListNoteOccurrencesRequest,io.grafeas.v1beta1.ListNoteOccurrencesResponse,com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListNoteOccurrencesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^GrafeasV1Beta1StubSettings$Builder this]
    (-> this (.listNoteOccurrencesSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^GrafeasV1Beta1StubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn batch-create-notes-settings
  "Returns the builder for the settings used for calls to batchCreateNotes.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<io.grafeas.v1beta1.BatchCreateNotesRequest,io.grafeas.v1beta1.BatchCreateNotesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GrafeasV1Beta1StubSettings$Builder this]
    (-> this (.batchCreateNotesSettings))))

(defn batch-create-occurrences-settings
  "Returns the builder for the settings used for calls to batchCreateOccurrences.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<io.grafeas.v1beta1.BatchCreateOccurrencesRequest,io.grafeas.v1beta1.BatchCreateOccurrencesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GrafeasV1Beta1StubSettings$Builder this]
    (-> this (.batchCreateOccurrencesSettings))))

(defn create-note-settings
  "Returns the builder for the settings used for calls to createNote.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<io.grafeas.v1beta1.CreateNoteRequest,io.grafeas.v1beta1.Note>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GrafeasV1Beta1StubSettings$Builder this]
    (-> this (.createNoteSettings))))

(defn list-notes-settings
  "Returns the builder for the settings used for calls to listNotes.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<io.grafeas.v1beta1.ListNotesRequest,io.grafeas.v1beta1.ListNotesResponse,com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListNotesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^GrafeasV1Beta1StubSettings$Builder this]
    (-> this (.listNotesSettings))))

