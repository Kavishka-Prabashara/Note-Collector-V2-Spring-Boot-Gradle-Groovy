package lk.ijse.gdse.aad67.notecollectorv2.customStatusCodes;


import lk.ijse.gdse.aad67.notecollectorv2.dto.NoteStatus;
import lk.ijse.gdse.aad67.notecollectorv2.dto.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SelectedUserAndNoteErrorStatus implements UserStatus, NoteStatus {
    private int statusCode;
    private String statusMessage;
}
