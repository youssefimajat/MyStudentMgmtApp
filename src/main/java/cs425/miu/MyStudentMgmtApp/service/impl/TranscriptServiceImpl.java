package cs425.miu.MyStudentMgmtApp.service.impl;

import cs425.miu.MyStudentMgmtApp.model.Transcript;
import cs425.miu.MyStudentMgmtApp.repository.TranscriptRepository;
import cs425.miu.MyStudentMgmtApp.service.TranscriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class TranscriptServiceImpl implements TranscriptService {
    @Autowired
    private TranscriptRepository transcriptRepository;
    @Override
    public Transcript addNewTranscript(Transcript transcript) {
        var newTranscript = transcriptRepository.save(transcript);
        return newTranscript;
    }

    @Override
    public List<Transcript> getAllTranscript() {
        var transcript = transcriptRepository.findAll();
        return transcript;
    }

    @Override
    public Transcript updateTranscript(Transcript transcript) {
        return transcriptRepository.save(transcript);
    }

    @Override
    public void deleteTranscript(Long transcriptId) {
    transcriptRepository.deleteById(transcriptId);
    }
}
