(ns com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrafeasV1Beta1StubSettings
  "Settings class to configure an instance of GrafeasV1Beta1Stub.

  The default instance has everything set to sensible defaults:


    The default service address (containeranalysis.googleapis.com) and default port (443) are
        used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getOccurrence to 30 seconds:



  GrafeasV1Beta1StubSettings.Builder grafeasV1Beta1SettingsBuilder =
      GrafeasV1Beta1StubSettings.newBuilder();
  grafeasV1Beta1SettingsBuilder.getOccurrenceSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  GrafeasV1Beta1StubSettings grafeasV1Beta1Settings = grafeasV1Beta1SettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.devtools.containeranalysis.v1beta1.stub GrafeasV1Beta1StubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (GrafeasV1Beta1StubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (GrafeasV1Beta1StubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (GrafeasV1Beta1StubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (GrafeasV1Beta1StubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (GrafeasV1Beta1StubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (GrafeasV1Beta1StubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (GrafeasV1Beta1StubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrafeasV1Beta1StubSettings$Builder`"
  (^com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrafeasV1Beta1StubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (GrafeasV1Beta1StubSettings/newBuilder client-context))
  (^com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrafeasV1Beta1StubSettings$Builder []
    (GrafeasV1Beta1StubSettings/newBuilder )))

(defn delete-note-settings
  "Returns the object with the settings used for calls to deleteNote.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<io.grafeas.v1beta1.DeleteNoteRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GrafeasV1Beta1StubSettings this]
    (-> this (.deleteNoteSettings))))

(defn create-occurrence-settings
  "Returns the object with the settings used for calls to createOccurrence.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<io.grafeas.v1beta1.CreateOccurrenceRequest,io.grafeas.v1beta1.Occurrence>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GrafeasV1Beta1StubSettings this]
    (-> this (.createOccurrenceSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrafeasV1Beta1Stub`

  throws: java.io.IOException"
  ([^GrafeasV1Beta1StubSettings this]
    (-> this (.createStub))))

(defn get-vulnerability-occurrences-summary-settings
  "Returns the object with the settings used for calls to getVulnerabilityOccurrencesSummary.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<io.grafeas.v1beta1.GetVulnerabilityOccurrencesSummaryRequest,io.grafeas.v1beta1.VulnerabilityOccurrencesSummary>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GrafeasV1Beta1StubSettings this]
    (-> this (.getVulnerabilityOccurrencesSummarySettings))))

(defn update-occurrence-settings
  "Returns the object with the settings used for calls to updateOccurrence.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<io.grafeas.v1beta1.UpdateOccurrenceRequest,io.grafeas.v1beta1.Occurrence>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GrafeasV1Beta1StubSettings this]
    (-> this (.updateOccurrenceSettings))))

(defn get-occurrence-settings
  "Returns the object with the settings used for calls to getOccurrence.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<io.grafeas.v1beta1.GetOccurrenceRequest,io.grafeas.v1beta1.Occurrence>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GrafeasV1Beta1StubSettings this]
    (-> this (.getOccurrenceSettings))))

(defn get-note-settings
  "Returns the object with the settings used for calls to getNote.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<io.grafeas.v1beta1.GetNoteRequest,io.grafeas.v1beta1.Note>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GrafeasV1Beta1StubSettings this]
    (-> this (.getNoteSettings))))

(defn update-note-settings
  "Returns the object with the settings used for calls to updateNote.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<io.grafeas.v1beta1.UpdateNoteRequest,io.grafeas.v1beta1.Note>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GrafeasV1Beta1StubSettings this]
    (-> this (.updateNoteSettings))))

(defn list-occurrences-settings
  "Returns the object with the settings used for calls to listOccurrences.

  returns: `com.google.api.gax.rpc.PagedCallSettings<io.grafeas.v1beta1.ListOccurrencesRequest,io.grafeas.v1beta1.ListOccurrencesResponse,com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListOccurrencesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^GrafeasV1Beta1StubSettings this]
    (-> this (.listOccurrencesSettings))))

(defn delete-occurrence-settings
  "Returns the object with the settings used for calls to deleteOccurrence.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<io.grafeas.v1beta1.DeleteOccurrenceRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GrafeasV1Beta1StubSettings this]
    (-> this (.deleteOccurrenceSettings))))

(defn get-occurrence-note-settings
  "Returns the object with the settings used for calls to getOccurrenceNote.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<io.grafeas.v1beta1.GetOccurrenceNoteRequest,io.grafeas.v1beta1.Note>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GrafeasV1Beta1StubSettings this]
    (-> this (.getOccurrenceNoteSettings))))

(defn list-note-occurrences-settings
  "Returns the object with the settings used for calls to listNoteOccurrences.

  returns: `com.google.api.gax.rpc.PagedCallSettings<io.grafeas.v1beta1.ListNoteOccurrencesRequest,io.grafeas.v1beta1.ListNoteOccurrencesResponse,com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListNoteOccurrencesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^GrafeasV1Beta1StubSettings this]
    (-> this (.listNoteOccurrencesSettings))))

(defn batch-create-notes-settings
  "Returns the object with the settings used for calls to batchCreateNotes.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<io.grafeas.v1beta1.BatchCreateNotesRequest,io.grafeas.v1beta1.BatchCreateNotesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GrafeasV1Beta1StubSettings this]
    (-> this (.batchCreateNotesSettings))))

(defn batch-create-occurrences-settings
  "Returns the object with the settings used for calls to batchCreateOccurrences.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<io.grafeas.v1beta1.BatchCreateOccurrencesRequest,io.grafeas.v1beta1.BatchCreateOccurrencesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GrafeasV1Beta1StubSettings this]
    (-> this (.batchCreateOccurrencesSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrafeasV1Beta1StubSettings$Builder`"
  (^com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrafeasV1Beta1StubSettings$Builder [^GrafeasV1Beta1StubSettings this]
    (-> this (.toBuilder))))

(defn create-note-settings
  "Returns the object with the settings used for calls to createNote.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<io.grafeas.v1beta1.CreateNoteRequest,io.grafeas.v1beta1.Note>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GrafeasV1Beta1StubSettings this]
    (-> this (.createNoteSettings))))

(defn list-notes-settings
  "Returns the object with the settings used for calls to listNotes.

  returns: `com.google.api.gax.rpc.PagedCallSettings<io.grafeas.v1beta1.ListNotesRequest,io.grafeas.v1beta1.ListNotesResponse,com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListNotesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^GrafeasV1Beta1StubSettings this]
    (-> this (.listNotesSettings))))

