package cs425.miu.MyStudentMgmtApp.service;

import cs425.miu.MyStudentMgmtApp.model.Student;
import cs425.miu.MyStudentMgmtApp.model.Transcript;

import java.util.List;

public interface TranscriptService {
    public abstract Transcript addNewTranscript(Transcript transcript);
    public abstract List<Transcript> getAllTranscript();
    public Transcript updateTranscript(Transcript transcript);
    public void deleteTranscript(Long TranscriptId);
}
