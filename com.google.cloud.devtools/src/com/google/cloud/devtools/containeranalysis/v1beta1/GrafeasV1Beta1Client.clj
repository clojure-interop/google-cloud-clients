(ns com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client
  "Service Description: [Grafeas](grafeas.io) API.

  Retrieves analysis results of Cloud components such as Docker container images.

  Analysis results are stored as a series of occurrences. An `Occurrence` contains information
  about a specific analysis instance on a resource. An occurrence refers to a `Note`. A note
  contains details describing the analysis and is generally stored in a separate project, called a
  `Provider`. Multiple occurrences can refer to the same note.

  For example, an SSL vulnerability could affect multiple images. In this case, there would be
  one note for the vulnerability and an occurrence for each image with the vulnerability referring
  to that note.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
    OccurrenceName name = OccurrenceName.of(\"[PROJECT]\", \"[OCCURRENCE]\");
    Occurrence response = grafeasV1Beta1Client.getOccurrence(name);
  }

  Note: close() needs to be called on the grafeasV1Beta1Client object to clean up resources such
  as threads. In the example above, try-with-resources is used, which automatically calls close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of GrafeasV1Beta1Settings to
  create(). For example:

  To customize credentials:



  GrafeasV1Beta1Settings grafeasV1Beta1Settings =
      GrafeasV1Beta1Settings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  GrafeasV1Beta1Client grafeasV1Beta1Client =
      GrafeasV1Beta1Client.create(grafeasV1Beta1Settings);

  To customize the endpoint:



  GrafeasV1Beta1Settings grafeasV1Beta1Settings =
      GrafeasV1Beta1Settings.newBuilder().setEndpoint(myEndpoint).build();
  GrafeasV1Beta1Client grafeasV1Beta1Client =
      GrafeasV1Beta1Client.create(grafeasV1Beta1Settings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.devtools.containeranalysis.v1beta1 GrafeasV1Beta1Client]))

(defn *create
  "Constructs an instance of GrafeasV1Beta1Client, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Settings`

  returns: `com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client`

  throws: java.io.IOException"
  (^com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client [^com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Settings settings]
    (GrafeasV1Beta1Client/create settings))
  (^com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client []
    (GrafeasV1Beta1Client/create )))

(defn list-notes-paged-callable
  "Lists notes for the specified project.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ListNotesRequest request = ListNotesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListNotesPagedResponse> future = grafeasV1Beta1Client.listNotesPagedCallable().futureCall(request);
     // Do something
     for (Note element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.ListNotesRequest,com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListNotesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrafeasV1Beta1Client this]
    (-> this (.listNotesPagedCallable))))

(defn create-note
  "Creates a new note.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     String noteId = \"\";
     Note note = Note.newBuilder().build();
     Note response = grafeasV1Beta1Client.createNote(parent, noteId, note);
   }

  parent - The name of the project in the form of `projects/[PROJECT_ID]`, under which the note is to be created. - `com.google.containeranalysis.v1beta1.ProjectName`
  note-id - The ID to use for this note. - `java.lang.String`
  note - The note to create. - `io.grafeas.v1beta1.Note`

  returns: `io.grafeas.v1beta1.Note`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^io.grafeas.v1beta1.Note [^GrafeasV1Beta1Client this ^com.google.containeranalysis.v1beta1.ProjectName parent ^java.lang.String note-id ^io.grafeas.v1beta1.Note note]
    (-> this (.createNote parent note-id note)))
  (^io.grafeas.v1beta1.Note [^GrafeasV1Beta1Client this ^io.grafeas.v1beta1.CreateNoteRequest request]
    (-> this (.createNote request))))

(defn batch-create-notes-callable
  "Creates new notes in batch.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     Map<String, Note> notes = new HashMap<>();
     BatchCreateNotesRequest request = BatchCreateNotesRequest.newBuilder()
       .setParent(parent.toString())
       .putAllNotes(notes)
       .build();
     ApiFuture<BatchCreateNotesResponse> future = grafeasV1Beta1Client.batchCreateNotesCallable().futureCall(request);
     // Do something
     BatchCreateNotesResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.BatchCreateNotesRequest,io.grafeas.v1beta1.BatchCreateNotesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrafeasV1Beta1Client this]
    (-> this (.batchCreateNotesCallable))))

(defn batch-create-occurrences
  "Creates new occurrences in batch.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     List<Occurrence> occurrences = new ArrayList<>();
     BatchCreateOccurrencesResponse response = grafeasV1Beta1Client.batchCreateOccurrences(parent, occurrences);
   }

  parent - The name of the project in the form of `projects/[PROJECT_ID]`, under which the occurrences are to be created. - `com.google.containeranalysis.v1beta1.ProjectName`
  occurrences - The occurrences to create. - `java.util.List`

  returns: `io.grafeas.v1beta1.BatchCreateOccurrencesResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^io.grafeas.v1beta1.BatchCreateOccurrencesResponse [^GrafeasV1Beta1Client this ^com.google.containeranalysis.v1beta1.ProjectName parent ^java.util.List occurrences]
    (-> this (.batchCreateOccurrences parent occurrences)))
  (^io.grafeas.v1beta1.BatchCreateOccurrencesResponse [^GrafeasV1Beta1Client this ^io.grafeas.v1beta1.BatchCreateOccurrencesRequest request]
    (-> this (.batchCreateOccurrences request))))

(defn list-note-occurrences-paged-callable
  "Lists occurrences referencing the specified note. Provider projects can use this method to get
   all occurrences across consumer projects referencing the specified note.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     NoteName name = NoteName.of(\"[PROJECT]\", \"[NOTE]\");
     ListNoteOccurrencesRequest request = ListNoteOccurrencesRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<ListNoteOccurrencesPagedResponse> future = grafeasV1Beta1Client.listNoteOccurrencesPagedCallable().futureCall(request);
     // Do something
     for (Occurrence element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.ListNoteOccurrencesRequest,com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListNoteOccurrencesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrafeasV1Beta1Client this]
    (-> this (.listNoteOccurrencesPagedCallable))))

(defn list-occurrences-paged-callable
  "Lists occurrences for the specified project.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ListOccurrencesRequest request = ListOccurrencesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListOccurrencesPagedResponse> future = grafeasV1Beta1Client.listOccurrencesPagedCallable().futureCall(request);
     // Do something
     for (Occurrence element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.ListOccurrencesRequest,com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListOccurrencesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrafeasV1Beta1Client this]
    (-> this (.listOccurrencesPagedCallable))))

(defn get-note
  "Gets the specified note.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     NoteName name = NoteName.of(\"[PROJECT]\", \"[NOTE]\");
     Note response = grafeasV1Beta1Client.getNote(name);
   }

  name - The name of the note in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. - `com.google.containeranalysis.v1beta1.NoteName`

  returns: `io.grafeas.v1beta1.Note`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^io.grafeas.v1beta1.Note [^GrafeasV1Beta1Client this ^com.google.containeranalysis.v1beta1.NoteName name]
    (-> this (.getNote name))))

(defn create-note-callable
  "Creates a new note.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     String noteId = \"\";
     Note note = Note.newBuilder().build();
     CreateNoteRequest request = CreateNoteRequest.newBuilder()
       .setParent(parent.toString())
       .setNoteId(noteId)
       .setNote(note)
       .build();
     ApiFuture<Note> future = grafeasV1Beta1Client.createNoteCallable().futureCall(request);
     // Do something
     Note response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.CreateNoteRequest,io.grafeas.v1beta1.Note>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrafeasV1Beta1Client this]
    (-> this (.createNoteCallable))))

(defn get-occurrence-note
  "Gets the note attached to the specified occurrence. Consumer projects can use this method to
   get a note that belongs to a provider project.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     OccurrenceName name = OccurrenceName.of(\"[PROJECT]\", \"[OCCURRENCE]\");
     Note response = grafeasV1Beta1Client.getOccurrenceNote(name);
   }

  name - The name of the occurrence in the form of `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`. - `com.google.containeranalysis.v1beta1.OccurrenceName`

  returns: `io.grafeas.v1beta1.Note`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^io.grafeas.v1beta1.Note [^GrafeasV1Beta1Client this ^com.google.containeranalysis.v1beta1.OccurrenceName name]
    (-> this (.getOccurrenceNote name))))

(defn get-settings
  "returns: `com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Settings`"
  (^com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Settings [^GrafeasV1Beta1Client this]
    (-> this (.getSettings))))

(defn list-notes-callable
  "Lists notes for the specified project.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ListNotesRequest request = ListNotesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListNotesResponse response = grafeasV1Beta1Client.listNotesCallable().call(request);
       for (Note element : response.getNotesList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.ListNotesRequest,io.grafeas.v1beta1.ListNotesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrafeasV1Beta1Client this]
    (-> this (.listNotesCallable))))

(defn update-note
  "Updates the specified note.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     NoteName name = NoteName.of(\"[PROJECT]\", \"[NOTE]\");
     Note note = Note.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     Note response = grafeasV1Beta1Client.updateNote(name, note, updateMask);
   }

  name - The name of the note in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. - `com.google.containeranalysis.v1beta1.NoteName`
  note - The updated note. - `io.grafeas.v1beta1.Note`
  update-mask - The fields to update. - `com.google.protobuf.FieldMask`

  returns: `io.grafeas.v1beta1.Note`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^io.grafeas.v1beta1.Note [^GrafeasV1Beta1Client this ^com.google.containeranalysis.v1beta1.NoteName name ^io.grafeas.v1beta1.Note note ^com.google.protobuf.FieldMask update-mask]
    (-> this (.updateNote name note update-mask)))
  (^io.grafeas.v1beta1.Note [^GrafeasV1Beta1Client this ^io.grafeas.v1beta1.UpdateNoteRequest request]
    (-> this (.updateNote request))))

(defn list-note-occurrences-callable
  "Lists occurrences referencing the specified note. Provider projects can use this method to get
   all occurrences across consumer projects referencing the specified note.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     NoteName name = NoteName.of(\"[PROJECT]\", \"[NOTE]\");
     ListNoteOccurrencesRequest request = ListNoteOccurrencesRequest.newBuilder()
       .setName(name.toString())
       .build();
     while (true) {
       ListNoteOccurrencesResponse response = grafeasV1Beta1Client.listNoteOccurrencesCallable().call(request);
       for (Occurrence element : response.getOccurrencesList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.ListNoteOccurrencesRequest,io.grafeas.v1beta1.ListNoteOccurrencesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrafeasV1Beta1Client this]
    (-> this (.listNoteOccurrencesCallable))))

(defn create-occurrence-callable
  "Creates a new occurrence.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     Occurrence occurrence = Occurrence.newBuilder().build();
     CreateOccurrenceRequest request = CreateOccurrenceRequest.newBuilder()
       .setParent(parent.toString())
       .setOccurrence(occurrence)
       .build();
     ApiFuture<Occurrence> future = grafeasV1Beta1Client.createOccurrenceCallable().futureCall(request);
     // Do something
     Occurrence response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.CreateOccurrenceRequest,io.grafeas.v1beta1.Occurrence>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrafeasV1Beta1Client this]
    (-> this (.createOccurrenceCallable))))

(defn batch-create-occurrences-callable
  "Creates new occurrences in batch.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     List<Occurrence> occurrences = new ArrayList<>();
     BatchCreateOccurrencesRequest request = BatchCreateOccurrencesRequest.newBuilder()
       .setParent(parent.toString())
       .addAllOccurrences(occurrences)
       .build();
     ApiFuture<BatchCreateOccurrencesResponse> future = grafeasV1Beta1Client.batchCreateOccurrencesCallable().futureCall(request);
     // Do something
     BatchCreateOccurrencesResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.BatchCreateOccurrencesRequest,io.grafeas.v1beta1.BatchCreateOccurrencesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrafeasV1Beta1Client this]
    (-> this (.batchCreateOccurrencesCallable))))

(defn list-notes
  "Lists notes for the specified project.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     String filter = \"\";
     for (Note element : grafeasV1Beta1Client.listNotes(parent, filter).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - The name of the project to list notes for in the form of `projects/[PROJECT_ID]`. - `com.google.containeranalysis.v1beta1.ProjectName`
  filter - The filter expression. - `java.lang.String`

  returns: `com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListNotesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListNotesPagedResponse [^GrafeasV1Beta1Client this ^com.google.containeranalysis.v1beta1.ProjectName parent ^java.lang.String filter]
    (-> this (.listNotes parent filter)))
  (^com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListNotesPagedResponse [^GrafeasV1Beta1Client this ^io.grafeas.v1beta1.ListNotesRequest request]
    (-> this (.listNotes request))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrafeasV1Beta1Stub`"
  ([^GrafeasV1Beta1Client this]
    (-> this (.getStub))))

(defn delete-note
  "Deletes the specified note.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     NoteName name = NoteName.of(\"[PROJECT]\", \"[NOTE]\");
     grafeasV1Beta1Client.deleteNote(name);
   }

  name - The name of the note in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. - `com.google.containeranalysis.v1beta1.NoteName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^GrafeasV1Beta1Client this ^com.google.containeranalysis.v1beta1.NoteName name]
    (-> this (.deleteNote name))))

(defn create-occurrence
  "Creates a new occurrence.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     Occurrence occurrence = Occurrence.newBuilder().build();
     Occurrence response = grafeasV1Beta1Client.createOccurrence(parent, occurrence);
   }

  parent - The name of the project in the form of `projects/[PROJECT_ID]`, under which the occurrence is to be created. - `com.google.containeranalysis.v1beta1.ProjectName`
  occurrence - The occurrence to create. - `io.grafeas.v1beta1.Occurrence`

  returns: `io.grafeas.v1beta1.Occurrence`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^io.grafeas.v1beta1.Occurrence [^GrafeasV1Beta1Client this ^com.google.containeranalysis.v1beta1.ProjectName parent ^io.grafeas.v1beta1.Occurrence occurrence]
    (-> this (.createOccurrence parent occurrence)))
  (^io.grafeas.v1beta1.Occurrence [^GrafeasV1Beta1Client this ^io.grafeas.v1beta1.CreateOccurrenceRequest request]
    (-> this (.createOccurrence request))))

(defn delete-note-callable
  "Deletes the specified note.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     NoteName name = NoteName.of(\"[PROJECT]\", \"[NOTE]\");
     DeleteNoteRequest request = DeleteNoteRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = grafeasV1Beta1Client.deleteNoteCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.DeleteNoteRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrafeasV1Beta1Client this]
    (-> this (.deleteNoteCallable))))

(defn batch-create-notes
  "Creates new notes in batch.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     Map<String, Note> notes = new HashMap<>();
     BatchCreateNotesResponse response = grafeasV1Beta1Client.batchCreateNotes(parent, notes);
   }

  parent - The name of the project in the form of `projects/[PROJECT_ID]`, under which the notes are to be created. - `com.google.containeranalysis.v1beta1.ProjectName`
  notes - The notes to create. - `java.util.Map`

  returns: `io.grafeas.v1beta1.BatchCreateNotesResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^io.grafeas.v1beta1.BatchCreateNotesResponse [^GrafeasV1Beta1Client this ^com.google.containeranalysis.v1beta1.ProjectName parent ^java.util.Map notes]
    (-> this (.batchCreateNotes parent notes)))
  (^io.grafeas.v1beta1.BatchCreateNotesResponse [^GrafeasV1Beta1Client this ^io.grafeas.v1beta1.BatchCreateNotesRequest request]
    (-> this (.batchCreateNotes request))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrafeasV1Beta1Client this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrafeasV1Beta1Client this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn get-vulnerability-occurrences-summary
  "Gets a summary of the number and severity of occurrences.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     String filter = \"\";
     VulnerabilityOccurrencesSummary response = grafeasV1Beta1Client.getVulnerabilityOccurrencesSummary(parent, filter);
   }

  parent - The name of the project to get a vulnerability summary for in the form of `projects/[PROJECT_ID]`. - `com.google.containeranalysis.v1beta1.ProjectName`
  filter - The filter expression. - `java.lang.String`

  returns: `io.grafeas.v1beta1.VulnerabilityOccurrencesSummary`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^io.grafeas.v1beta1.VulnerabilityOccurrencesSummary [^GrafeasV1Beta1Client this ^com.google.containeranalysis.v1beta1.ProjectName parent ^java.lang.String filter]
    (-> this (.getVulnerabilityOccurrencesSummary parent filter)))
  (^io.grafeas.v1beta1.VulnerabilityOccurrencesSummary [^GrafeasV1Beta1Client this ^io.grafeas.v1beta1.GetVulnerabilityOccurrencesSummaryRequest request]
    (-> this (.getVulnerabilityOccurrencesSummary request))))

(defn shutdown
  ""
  ([^GrafeasV1Beta1Client this]
    (-> this (.shutdown))))

(defn get-occurrence-callable
  "Gets the specified occurrence.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     OccurrenceName name = OccurrenceName.of(\"[PROJECT]\", \"[OCCURRENCE]\");
     GetOccurrenceRequest request = GetOccurrenceRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Occurrence> future = grafeasV1Beta1Client.getOccurrenceCallable().futureCall(request);
     // Do something
     Occurrence response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.GetOccurrenceRequest,io.grafeas.v1beta1.Occurrence>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrafeasV1Beta1Client this]
    (-> this (.getOccurrenceCallable))))

(defn get-occurrence
  "Gets the specified occurrence.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     OccurrenceName name = OccurrenceName.of(\"[PROJECT]\", \"[OCCURRENCE]\");
     Occurrence response = grafeasV1Beta1Client.getOccurrence(name);
   }

  name - The name of the occurrence in the form of `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`. - `com.google.containeranalysis.v1beta1.OccurrenceName`

  returns: `io.grafeas.v1beta1.Occurrence`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^io.grafeas.v1beta1.Occurrence [^GrafeasV1Beta1Client this ^com.google.containeranalysis.v1beta1.OccurrenceName name]
    (-> this (.getOccurrence name))))

(defn list-occurrences-callable
  "Lists occurrences for the specified project.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ListOccurrencesRequest request = ListOccurrencesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListOccurrencesResponse response = grafeasV1Beta1Client.listOccurrencesCallable().call(request);
       for (Occurrence element : response.getOccurrencesList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.ListOccurrencesRequest,io.grafeas.v1beta1.ListOccurrencesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrafeasV1Beta1Client this]
    (-> this (.listOccurrencesCallable))))

(defn update-occurrence-callable
  "Updates the specified occurrence.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     OccurrenceName name = OccurrenceName.of(\"[PROJECT]\", \"[OCCURRENCE]\");
     Occurrence occurrence = Occurrence.newBuilder().build();
     UpdateOccurrenceRequest request = UpdateOccurrenceRequest.newBuilder()
       .setName(name.toString())
       .setOccurrence(occurrence)
       .build();
     ApiFuture<Occurrence> future = grafeasV1Beta1Client.updateOccurrenceCallable().futureCall(request);
     // Do something
     Occurrence response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.UpdateOccurrenceRequest,io.grafeas.v1beta1.Occurrence>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrafeasV1Beta1Client this]
    (-> this (.updateOccurrenceCallable))))

(defn get-note-callable
  "Gets the specified note.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     NoteName name = NoteName.of(\"[PROJECT]\", \"[NOTE]\");
     GetNoteRequest request = GetNoteRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Note> future = grafeasV1Beta1Client.getNoteCallable().futureCall(request);
     // Do something
     Note response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.GetNoteRequest,io.grafeas.v1beta1.Note>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrafeasV1Beta1Client this]
    (-> this (.getNoteCallable))))

(defn close
  ""
  ([^GrafeasV1Beta1Client this]
    (-> this (.close))))

(defn delete-occurrence
  "Deletes the specified occurrence. For example, use this method to delete an occurrence when the
   occurrence is no longer applicable for the given resource.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     OccurrenceName name = OccurrenceName.of(\"[PROJECT]\", \"[OCCURRENCE]\");
     grafeasV1Beta1Client.deleteOccurrence(name);
   }

  name - The name of the occurrence in the form of `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`. - `com.google.containeranalysis.v1beta1.OccurrenceName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^GrafeasV1Beta1Client this ^com.google.containeranalysis.v1beta1.OccurrenceName name]
    (-> this (.deleteOccurrence name))))

(defn update-occurrence
  "Updates the specified occurrence.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     OccurrenceName name = OccurrenceName.of(\"[PROJECT]\", \"[OCCURRENCE]\");
     Occurrence occurrence = Occurrence.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     Occurrence response = grafeasV1Beta1Client.updateOccurrence(name, occurrence, updateMask);
   }

  name - The name of the occurrence in the form of `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`. - `com.google.containeranalysis.v1beta1.OccurrenceName`
  occurrence - The updated occurrence. - `io.grafeas.v1beta1.Occurrence`
  update-mask - The fields to update. - `com.google.protobuf.FieldMask`

  returns: `io.grafeas.v1beta1.Occurrence`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^io.grafeas.v1beta1.Occurrence [^GrafeasV1Beta1Client this ^com.google.containeranalysis.v1beta1.OccurrenceName name ^io.grafeas.v1beta1.Occurrence occurrence ^com.google.protobuf.FieldMask update-mask]
    (-> this (.updateOccurrence name occurrence update-mask)))
  (^io.grafeas.v1beta1.Occurrence [^GrafeasV1Beta1Client this ^io.grafeas.v1beta1.UpdateOccurrenceRequest request]
    (-> this (.updateOccurrence request))))

(defn get-occurrence-note-callable
  "Gets the note attached to the specified occurrence. Consumer projects can use this method to
   get a note that belongs to a provider project.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     OccurrenceName name = OccurrenceName.of(\"[PROJECT]\", \"[OCCURRENCE]\");
     GetOccurrenceNoteRequest request = GetOccurrenceNoteRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Note> future = grafeasV1Beta1Client.getOccurrenceNoteCallable().futureCall(request);
     // Do something
     Note response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.GetOccurrenceNoteRequest,io.grafeas.v1beta1.Note>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrafeasV1Beta1Client this]
    (-> this (.getOccurrenceNoteCallable))))

(defn list-occurrences
  "Lists occurrences for the specified project.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     String filter = \"\";
     for (Occurrence element : grafeasV1Beta1Client.listOccurrences(parent, filter).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - The name of the project to list occurrences for in the form of `projects/[PROJECT_ID]`. - `com.google.containeranalysis.v1beta1.ProjectName`
  filter - The filter expression. - `java.lang.String`

  returns: `com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListOccurrencesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListOccurrencesPagedResponse [^GrafeasV1Beta1Client this ^com.google.containeranalysis.v1beta1.ProjectName parent ^java.lang.String filter]
    (-> this (.listOccurrences parent filter)))
  (^com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListOccurrencesPagedResponse [^GrafeasV1Beta1Client this ^io.grafeas.v1beta1.ListOccurrencesRequest request]
    (-> this (.listOccurrences request))))

(defn delete-occurrence-callable
  "Deletes the specified occurrence. For example, use this method to delete an occurrence when the
   occurrence is no longer applicable for the given resource.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     OccurrenceName name = OccurrenceName.of(\"[PROJECT]\", \"[OCCURRENCE]\");
     DeleteOccurrenceRequest request = DeleteOccurrenceRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = grafeasV1Beta1Client.deleteOccurrenceCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.DeleteOccurrenceRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrafeasV1Beta1Client this]
    (-> this (.deleteOccurrenceCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrafeasV1Beta1Client this]
    (-> this (.isTerminated))))

(defn get-vulnerability-occurrences-summary-callable
  "Gets a summary of the number and severity of occurrences.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     GetVulnerabilityOccurrencesSummaryRequest request = GetVulnerabilityOccurrencesSummaryRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<VulnerabilityOccurrencesSummary> future = grafeasV1Beta1Client.getVulnerabilityOccurrencesSummaryCallable().futureCall(request);
     // Do something
     VulnerabilityOccurrencesSummary response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.GetVulnerabilityOccurrencesSummaryRequest,io.grafeas.v1beta1.VulnerabilityOccurrencesSummary>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrafeasV1Beta1Client this]
    (-> this (.getVulnerabilityOccurrencesSummaryCallable))))

(defn update-note-callable
  "Updates the specified note.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     NoteName name = NoteName.of(\"[PROJECT]\", \"[NOTE]\");
     Note note = Note.newBuilder().build();
     UpdateNoteRequest request = UpdateNoteRequest.newBuilder()
       .setName(name.toString())
       .setNote(note)
       .build();
     ApiFuture<Note> future = grafeasV1Beta1Client.updateNoteCallable().futureCall(request);
     // Do something
     Note response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.UpdateNoteRequest,io.grafeas.v1beta1.Note>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrafeasV1Beta1Client this]
    (-> this (.updateNoteCallable))))

(defn shutdown-now
  ""
  ([^GrafeasV1Beta1Client this]
    (-> this (.shutdownNow))))

(defn list-note-occurrences
  "Lists occurrences referencing the specified note. Provider projects can use this method to get
   all occurrences across consumer projects referencing the specified note.

   Sample code:



   try (GrafeasV1Beta1Client grafeasV1Beta1Client = GrafeasV1Beta1Client.create()) {
     NoteName name = NoteName.of(\"[PROJECT]\", \"[NOTE]\");
     String filter = \"\";
     for (Occurrence element : grafeasV1Beta1Client.listNoteOccurrences(name, filter).iterateAll()) {
       // doThingsWith(element);
     }
   }

  name - The name of the note to list occurrences for in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. - `com.google.containeranalysis.v1beta1.NoteName`
  filter - The filter expression. - `java.lang.String`

  returns: `com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListNoteOccurrencesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListNoteOccurrencesPagedResponse [^GrafeasV1Beta1Client this ^com.google.containeranalysis.v1beta1.NoteName name ^java.lang.String filter]
    (-> this (.listNoteOccurrences name filter)))
  (^com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListNoteOccurrencesPagedResponse [^GrafeasV1Beta1Client this ^io.grafeas.v1beta1.ListNoteOccurrencesRequest request]
    (-> this (.listNoteOccurrences request))))

